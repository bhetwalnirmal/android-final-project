package com.nirmalbhetwal.androidfinalproject;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.ViewHolder> {
    private List<Question> questionList;

    public QuestionAdapter(List<Question> questionList) {
        this.questionList = questionList;
    }

    @NonNull
    @Override
    public QuestionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View optionView = inflater.inflate(R.layout.question_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(optionView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull QuestionAdapter.ViewHolder holder, int position) {
        Question question = questionList.get(position);

        TextView tvQuestionText = holder.questionText;
        tvQuestionText.setText(questionList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return questionList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView questionText;
        private RecyclerView rvOptions;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            questionText = (TextView) itemView.findViewById(R.id.questionText);
            rvOptions = (RecyclerView) itemView.findViewById(R.id.options);
            OptionAdapter optionAdapter = new OptionAdapter(questionList.get(0).getOptions());
//
            rvOptions.setAdapter(optionAdapter);
//
//            questionText.setText(questionList.get(0).getName());
//
            rvOptions.setLayoutManager(new LinearLayoutManager(itemView.getContext()));
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();

        }
    }
}

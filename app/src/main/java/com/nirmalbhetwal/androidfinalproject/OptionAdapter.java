package com.nirmalbhetwal.androidfinalproject;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OptionAdapter extends RecyclerView.Adapter<OptionAdapter.ViewHolder> {
    private List<Option> optionList;

    public OptionAdapter(List<Option> optionList) {
        this.optionList = optionList;
    }

    @NonNull
    @Override
    public OptionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View optionView = inflater.inflate(R.layout.opiton_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(optionView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OptionAdapter.ViewHolder holder, int position) {
        Option option = optionList.get(position);

        TextView tvOption = holder.option;
        tvOption.setText(option.getName());
    }

    @Override
    public int getItemCount() {
        return optionList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView option;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            option = (TextView) itemView.findViewById(R.id.answer);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();

            if (position != RecyclerView.NO_POSITION) {
                Option clickedOption = optionList.get(position);

                updateOption(clickedOption, view, position);
            }
        }
    }

    void updateOption (Option option, View view, int position) {
        GradientDrawable shape =  new GradientDrawable();
        shape.setCornerRadius( 50 );

        if (option.isCorrectAnswer() == true) {
            shape.setColor(Color.GREEN);
        } else {
            shape.setColor(Color.RED);
        }

        view.setBackground(shape);
    }
}

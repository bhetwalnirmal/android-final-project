package com.nirmalbhetwal.androidfinalproject;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
        private ImageView checkMark;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            option = (TextView) itemView.findViewById(R.id.answer);
            checkMark = (ImageView) itemView.findViewById(R.id.checkmark);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();

            if (position != RecyclerView.NO_POSITION) {
                Option clickedOption = optionList.get(position);
                Log.d("sdf", "" + clickedOption.isCorrectAnswer());
                updateOption(clickedOption, view, checkMark);
            }
        }
    }

    void updateOption (Option option, View view, ImageView checkMark) {
        if (option.isCorrectAnswer()) {
            checkMark.setBackgroundResource(R.drawable.baseline_check_24);
        } else {
            checkMark.setBackgroundResource(R.drawable.baseline_clear_24);
        }

        checkMark.setVisibility(View.VISIBLE);
    }
}

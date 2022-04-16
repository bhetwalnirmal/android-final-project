package com.nirmalbhetwal.androidfinalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Question> questionList = new ArrayList<>();
    TextView questionText;
    RecyclerView rvQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fillData();

        rvQuestion = (RecyclerView) findViewById(R.id.rvQuestion);
        QuestionAdapter questionAdapter = new QuestionAdapter(questionList);
        rvQuestion.setAdapter(questionAdapter);
        rvQuestion.setLayoutManager(new LinearLayoutManager(this));
    }

    void fillData () {
        Question question = new Question("What are the layouts available in android?", Arrays.asList(new Option[]{
                new Option("Linear Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("Relative Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("Frame Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("All of the above", true, Option.Q_TYPE.CASE_ANDROID)
        }));

        questionList.add(question);
    }
}
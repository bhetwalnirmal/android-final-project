package com.nirmalbhetwal.androidfinalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
        Collections.shuffle(questionList);
        QuestionAdapter questionAdapter = new QuestionAdapter(questionList.stream().limit(5).collect(Collectors.toList()));
        rvQuestion.setAdapter(questionAdapter);
        rvQuestion.setLayoutManager(new LinearLayoutManager(this));
    }

    void fillData () {
        Question question = new Question("0What are the layouts available in android?", Arrays.asList(new Option[]{
                new Option("Linear Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("Relative Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("Frame Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("All of the above", true, Option.Q_TYPE.CASE_ANDROID)
        }));

        questionList.add(new Question("1What are the layouts available in android?", Arrays.asList(new Option[]{
                new Option("Linear Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("Relative Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("Frame Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("All of the above", true, Option.Q_TYPE.CASE_ANDROID)
        })));

        questionList.add(new Question("2What are the layouts available in android?", Arrays.asList(new Option[]{
                new Option("Linear Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("Relative Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("Frame Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("All of the above", true, Option.Q_TYPE.CASE_ANDROID)
        })));

        questionList.add(new Question("3What are the layouts available in android?", Arrays.asList(new Option[]{
                new Option("Linear Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("Relative Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("Frame Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("All of the above", true, Option.Q_TYPE.CASE_ANDROID)
        })));

        questionList.add(new Question("4What are the layouts available in android?", Arrays.asList(new Option[]{
                new Option("Linear Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("Relative Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("Frame Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("All of the above", true, Option.Q_TYPE.CASE_ANDROID)
        })));

        questionList.add(new Question("5What are the layouts available in android?", Arrays.asList(new Option[]{
                new Option("Linear Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("Relative Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("Frame Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("All of the above", true, Option.Q_TYPE.CASE_ANDROID)
        })));

        questionList.add(new Question("6What are the layouts available in android?", Arrays.asList(new Option[]{
                new Option("Linear Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("Relative Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("Frame Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("All of the above", true, Option.Q_TYPE.CASE_ANDROID)
        })));

        questionList.add(new Question("7What are the layouts available in android?", Arrays.asList(new Option[]{
                new Option("Linear Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("Relative Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("Frame Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("All of the above", true, Option.Q_TYPE.CASE_ANDROID)
        })));

        questionList.add(new Question("8What are the layouts available in android?", Arrays.asList(new Option[]{
                new Option("Linear Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("Relative Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("test1 Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("test2", true, Option.Q_TYPE.CASE_ANDROID)
        })));

        questionList.add(new Question("9 What are the layouts available in android?", Arrays.asList(new Option[]{
                new Option("Linear Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("Relative Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("test1 Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("test2", true, Option.Q_TYPE.CASE_ANDROID)
        })));

        questionList.add(new Question("10What are the layouts available in android?", Arrays.asList(new Option[]{
                new Option("Linear Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("Relative Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("test1 Layout", false, Option.Q_TYPE.CASE_ANDROID),
                new Option("test2", true, Option.Q_TYPE.CASE_ANDROID)
        })));

        questionList.add(question);
    }
}
package com.nirmalbhetwal.androidfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView questionText;
    ListView options;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionText = (TextView) findViewById(R.id.questionText);
        options = (ListView) findViewById(R.id.options);

        Question question = new Question("What are the layouts available in android?", new Option[]{
                new Option("Linear Layout", true, Option.Q_TYPE.CASE_ANDROID),
                new Option("Relative Layout", true, Option.Q_TYPE.CASE_ANDROID),
                new Option("Frame Layout", true, Option.Q_TYPE.CASE_ANDROID),
                new Option("Constraint Layout", true, Option.Q_TYPE.CASE_ANDROID)
        });

        questionText.setText(question.getName());
    }
}
package com.nirmalbhetwal.androidfinalproject;

import java.io.Serializable;

public class Option implements Serializable {
    private String name;
    private boolean isCorrectAnswer = false;
    private Q_TYPE questionType = Q_TYPE.CASE_ANDROID;

    public Option(String name, boolean isCorrectAnswer, Q_TYPE qType) {
        this.name = name;
        this.isCorrectAnswer = isCorrectAnswer;
        this.questionType = qType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCorrectAnswer() {
        return isCorrectAnswer;
    }

    public void setCorrectAnswer(boolean correctAnswer) {
        isCorrectAnswer = correctAnswer;
    }

    public Q_TYPE getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Q_TYPE questionType) {
        this.questionType = questionType;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    public enum Q_TYPE {
        CASE_IOS,
        CASE_ANDROID
    }
}

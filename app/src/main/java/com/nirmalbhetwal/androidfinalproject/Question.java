package com.nirmalbhetwal.androidfinalproject;

import java.util.Arrays;

public class Question {
    private String name;
    private Option[] options;

    public Question(String name, Option[] options) {
        this.name = name;
        this.options = options;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Option[] getOptions() {
        return options;
    }

    public void setOptions(Option[] options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}

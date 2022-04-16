package com.nirmalbhetwal.androidfinalproject;

import java.util.Arrays;
import java.util.List;

public class Question {
    private String name;
    private List<Option> options;

    public Question(String name, List<Option> options) {
        this.name = name;
        this.options = options;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}

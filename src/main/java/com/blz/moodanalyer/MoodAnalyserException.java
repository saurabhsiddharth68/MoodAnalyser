package com.blz.moodanalyer;

public class MoodAnalyserException extends Exception{
    public String message;

    public MoodAnalyserException(String message) {
        this.message = message;

    }
}

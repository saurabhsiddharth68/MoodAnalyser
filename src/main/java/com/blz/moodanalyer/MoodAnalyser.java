package com.blz.moodanalyer;

public class MoodAnalyser {
    public String analyserMood(String  message){
        if(message.toLowerCase().contains("sad")){
            return "SAD";
        }
        else{
            return null;
        }
    }
}

package com.blz.moodanalyer;

public class MoodAnalyser {
    public String analyserMood(String  message){
        if(message.toLowerCase().contains("sad")){
            return "SAD";
        }
        else if(message.toLowerCase().contains("any")){
            return "HAPPY";
        }
        else{
            return null;
        }
    }
}

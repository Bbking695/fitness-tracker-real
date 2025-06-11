package com.bbking.fitnesstracker;

public class Workout {
    private String type;
    private int duration; // in minutes
    private int caloriesBurned;

    public Workout(String type, int duration, int caloriesBurned) {
        this.type = type;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
    }

    public String getSummary() {
        return type + " - " + duration + " min - " + caloriesBurned + " cal";
    }
}

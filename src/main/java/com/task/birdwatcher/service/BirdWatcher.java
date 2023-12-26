package com.task.birdwatcher.service;

import java.util.Arrays;

public class BirdWatcher {
    private final int[] birdCount;

    public BirdWatcher(int[] birdCount){
        this.birdCount = Arrays.copyOf(birdCount, birdCount.length);
    }

    public int[] getLastWeek(){
        return Arrays.copyOf(birdCount, birdCount.length);
    }

    public int getToday(){
        return birdCount[birdCount.length - 1];
    }

    public void incrementTodaysCount(){
        birdCount[birdCount.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int count : birdCount) {
            if (count == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numDays) {
        int sum = 0;
        for (int i = 0; i < numDays && i < birdCount.length; i++) {
            sum = sum + birdCount[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int count : birdCount) {
            if (count >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}
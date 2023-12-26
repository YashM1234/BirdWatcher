package com.task.birdwatcher;

import com.task.birdwatcher.service.BirdWatcher;

import java.util.Arrays;

public class BirdWatcherApp {
    public static void main(String[] args) {

        int[] birdLastWeek = {0, 2, 5, 3, 7, 8, 4};

        BirdWatcher birdWatcher = new BirdWatcher(birdLastWeek);

        System.out.println("Last week count of birds are: " + Arrays.toString(birdWatcher.getLastWeek()));

        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };

        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);

        System.out.println("The bird count today is " + birdCount.getToday());

        birdCount.incrementTodaysCount();
        System.out.println("The bird count after incrementing is " + birdCount.getToday());

        System.out.println("Is there any day without birds: " + birdCount.hasDayWithoutBirds());

        System.out.println("Number of bird count from first day to input day is " + birdCount.getCountForFirstDays(4));

        System.out.println("Number of busy days are " + birdCount.getBusyDays());

    }
}
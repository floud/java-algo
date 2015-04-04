package com.getjavajob.training.algo05.halturina.util;

/**
 * Created by floud on 04.04.2015.
 */
public class Timer {

    public long startTime;
    public long endTime;

    public long start() {
        startTime = System.currentTimeMillis();
        return startTime;
    }

    public long getElapsedTime() {
        endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}

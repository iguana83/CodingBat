package com.company;

/**
 * Created by golova on 3/27/17.
 */
public class Warmup1SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation){
            return true;
        }
        return false;
    }
}

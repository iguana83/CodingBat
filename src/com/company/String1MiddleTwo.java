package com.company;

/**
 * Created by golova on 3/29/17.
 */
public class String1MiddleTwo {
    public String middleTwo(String str) {
        int middleOfTheWord = str.length() / 2;
        String middleTwo = str.substring(middleOfTheWord - 1, middleOfTheWord + 1);
        return middleTwo;
    }
}

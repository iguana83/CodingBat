package com.company;


/**
 * Created by golova on 3/29/17.
 */
public class Logic2RoundSum {
    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }
    public int round10(int num){
        int roundNum = 0;
        int lastNumber = num % 10; // 6
        roundNum = num - lastNumber; //10
        if(lastNumber >= 5) {
            roundNum += 10;
        }
        return roundNum;
    }
}

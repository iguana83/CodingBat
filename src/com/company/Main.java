package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Warmup1SleepIn sleepIn = new Warmup1SleepIn();
        Boolean answer = sleepIn.sleepIn(true, false);
        System.out.println(answer);


        ArrayCount9 count9 = new ArrayCount9();
        int[] nums = {5, 9, 9, 2, 9};
        int numberOf9 = count9.arrayCount9(nums);
        System.out.println(numberOf9);


        Array1FrontPiece frontPiece = new Array1FrontPiece();
        int[] result = frontPiece.frontPiece(nums);
        System.out.println(Arrays.toString(result));


        String1MiddleTwo middleTwo= new String1MiddleTwo();
        String middleTwoLettrs = middleTwo.middleTwo("presentation");
        System.out.println(middleTwoLettrs);


        Logic2RoundSum roundSum = new Logic2RoundSum();
        int finalRoundSum = roundSum.roundSum(7,4,9);
        System.out.println(finalRoundSum);


        Array1Bigger2 bigger2 = new Array1Bigger2();
        int[] a = {2, 4, 7};
        int[] b = {1, 5,13};
        int[] c = bigger2.biggerTwo(a, b);
        System.out.println(Arrays.toString(c));


        String2BobThere bob = new String2BobThere();
        Boolean results  = bob.bobThere("baobab");
        System.out.println(results);



    }
}

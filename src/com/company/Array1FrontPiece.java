package com.company;
/**
 * Created by golova on 3/29/17.
 */

import java.util.Arrays;

public class Array1FrontPiece {
    public int[] frontPiece(int[] nums) {
        int[] newArray;
        if(nums.length > 2) {
            newArray = Arrays.copyOfRange(nums, 0, 2);
        }
        else {
            newArray = Arrays.copyOf(nums, nums.length);
        }
        return newArray;
    }
}

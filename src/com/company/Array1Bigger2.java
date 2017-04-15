
package com.company;
/**
 * Created by golova on 3/30/17.
 */
public class Array1Bigger2 {
    public int[] biggerTwo(int[] a, int[] b) {
        int totalA = 0;
        int totalB = 0;

        for (int i = 0; i < a.length; i++) {
            totalA = totalA + a[i];
            totalB = totalB + b[i];

        }

        if (totalA >= totalB) {
            return a;
        }

        return b;
    }
}

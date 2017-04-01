package com.company;

/**
 * Created by golova on 3/30/17.
 */
public class String2BobThere {
    public boolean bobThere(String str) {
        if(str.length() < 3){
            return false;
        }
        for(int i = 0; i< (str.length() - 2); i++) {
            if(str.charAt(i) == 'b' && str.charAt(i+2) == 'b'){
                return true;
            }
        }
        return false;
    }
}

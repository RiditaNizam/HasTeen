package com.company;

/**
 * Created by ridita on 2/15/17.
 */
public class HasTeen {
    public boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            return true;
        } else {
            return false;
        }
    }
}

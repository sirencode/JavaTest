package com.test.diablo;

/**
 * Created by Diablo on 2016/12/23.
 */

public class FactionRankNum {

    private StringBuffer buffer = new StringBuffer("小于");
    private static final double HUAND = 100D;
    private static final int FIRST_STEP = 50;

    public String getFactionNum(int num) {
        if (num <= 0) {
            return "wrong num";
        }
        if (num <= FIRST_STEP) {
            return String.valueOf(num);
        } else {
            return buffer.append((int)(Math.ceil(num / HUAND) * HUAND)).toString();
        }
    }
}

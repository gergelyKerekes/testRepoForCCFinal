package com.codecool.whattoprint;

import java.util.Arrays;

class Challenge {

    public static String decideAndSay(String[] words, int number) {
        String ret = "";

        if (words.length > 1) {
            if (number % 3 == 0 && number % 7 == 0) {
                ret = words[0] + words[1];
            } else if (number % 3 == 0) {
                ret = words[0];
            } else if (number % 7 == 0) {
                ret = words[1];
            }
        }
        return ret;
    }
}


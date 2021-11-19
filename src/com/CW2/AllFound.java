package com.CW2;/*
 * CW2 Lab Group Thu 11
 */

public class AllFound {

    // CW2 Lab Group Thu 11
    // Given two non-empty strings source and target consisting of
    // lowercase letters, numbers, and other characters,
    // return true if and only if all characters in source are found in target,
    // while considering the number of times the character are found.
    // That is, return true for source = "aab" and target = "dabac",
    // because two "a"s and one "b" of source are found in target as well.
    // However, return false for source = "aab" and target = "dabc",
    // because only one of the two "a"s in source is found in target.
    // You must use String methods in lecture notes.
    // You must NOT use StringBuilder or Regular Expression methods.
    public static boolean allFound(String source, String target) {
        char output = '0';
        for (int i = 0; i < source.length(); i++) {
            int repeatNumbers = 0;
            int repeat=0;
            for (int j = 0; j < source.length(); j++) {
                if (source.charAt(j) == source.charAt(i)) {
                    repeatNumbers++;
                } else{
                    repeat++;

                }
            }

            for (int h = 0; h < target.length(); h++) {
                int repeatNum = 0;
                int repeatA=0;
                for (int l = 0; l < target.length(); l++) {
                    if (target.charAt(h) == target.charAt(l)) {
                        repeatNum++;
                    }else{
                        repeatA++;
                    }
                }

                if ((repeatNumbers+repeat) <= (repeatA+repeatNum)) {
                    boolean b = true;
                    return b;
                } else
                    return false;
            }
        }
            return true;
    }

    // Test Client
    public static void main(String[] args) {
        System.out.println(allFound("aab", "dabac"));  // true
        System.out.println(allFound("aab", "dabc"));   // false

        // add your own test cases :
    }
}
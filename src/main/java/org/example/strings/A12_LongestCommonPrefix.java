package org.example.strings;

import java.util.ArrayList;
import java.util.List;

// Vertical Scanning
public class A12_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"ajjagajaga", "ajjagaanadhaa", "ajukkanaa", "ajjpeeralaaaa"};
        int length = str.length;

        if (length == 0) {
            System.out.println("EMpty array");
            return;
        }

        if (length == 1) {
            System.out.println("Only one string in this array");
            return;
        }

        List<Character> prefix = new ArrayList<>();

        int currCharIdx = 0;
        int arrIdx = 0;
        char c;
        char globalChar = str[0].charAt(0);

        while (true) {
            if (arrIdx == (length - 1)) {
                arrIdx = 0;
                currCharIdx++;
                prefix.add(globalChar);

                try {
                    globalChar = str[0].charAt(currCharIdx);
                } catch (Exception e) {
                    System.out.println("Longest common prefix is : " + prefix);
                    return;
                }
            }

            try {
                c = str[arrIdx + 1].charAt(currCharIdx);
            } catch (Exception e) {
                System.out.println("Longest common prefix is : " + prefix);
                return;
            }

            if (c == globalChar) {
                arrIdx++;
            } else {
                System.out.println("Longest common prefix is : " + prefix);
                return;
            }
        }
    }
}
package org.example.strings;

import java.util.HashMap;
import java.util.Map;

public class A19_LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {

        String s = "ABBBABBBBBCDCCCCCC";
        int k = 1;

        int left = 0;
        int maxCount = 0;
        int maxFrequency = 0;

        Map<Character, Integer> copy = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            // increase frequency
            if (copy.containsKey(c)) {
                copy.put(c, copy.get(c) + 1);
            } else {
                copy.put(c, 1);
            }

            // update maximum frequency in current window
            maxFrequency = Math.max(maxFrequency, copy.get(c));

            // shrinking the window from left
            //main thing is to move left to one place right (i.e, left++),. but before that we need to decrease the frequency
            while ((right - left + 1) - maxFrequency > k) {

                char leftChar = s.charAt(left);
                copy.put(leftChar, copy.get(leftChar) - 1);

                left++;
            }

            maxCount = Math.max(maxCount, right - left + 1);
        }

        System.out.println("Longest is : " + maxCount);
    }
}
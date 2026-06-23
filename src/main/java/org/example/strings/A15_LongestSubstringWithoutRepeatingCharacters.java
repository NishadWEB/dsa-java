package org.example.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


// the pattern here is SLIDING WINDOW
public class A15_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "dabcsdhfyrtiurhjhcxgsafhushffjgfkjdakfsyuirehfkvxbchvh";

        int left = 0;
        int right = 0;
        int max = 0;
        int newCount = 0;

        Set<Character> copy = new HashSet<>();

        while (right < str.length()) {
            char c = str.charAt(right);

            if (!copy.contains(c)) {
                copy.add(c);
                newCount++;
                max = Math.max(newCount, max);
                right++;
            } else {
                while (copy.contains(c)) {
                    copy.remove(str.charAt(left));
                    newCount--;
                    left++;
                }
                copy.add(c);
                newCount++;
                right++;
            }
        }

        System.out.println("longest substring without repeating characters : " + max);
    }
}

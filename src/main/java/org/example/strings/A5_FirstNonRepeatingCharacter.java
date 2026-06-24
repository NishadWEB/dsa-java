package org.example.strings;

import java.util.ArrayList;
import java.util.List;

// 80% solved by me, but took little hints from gpt (not solution or code)
// Nested Loops + Duplicate Tracking
public class A5_FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "baaccdd";

        List<Character> repeated = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            boolean isRepeated = false;
            if (repeated.contains(s.charAt(i))) {
                continue;
            }

            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    repeated.add(s.charAt(i));
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                // print non-repeated character statement here
                System.out.println("non repeated character is : "+ s.charAt(i));
                return;
            }
        }
        System.out.println("there is no non repeating characters");
    }
}

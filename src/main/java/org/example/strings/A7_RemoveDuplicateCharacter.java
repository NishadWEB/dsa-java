package org.example.strings;

import java.util.ArrayList;
import java.util.List;

// Lookup Pattern (contains) + Deduplication
public class A7_RemoveDuplicateCharacter {
    public static void main(String[] args) {
        String s = "programming";
        List<Character> output = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (!output.contains(s.charAt(i))) {
                output.add(s.charAt(i));
            }
        }

        StringBuilder x = new StringBuilder();
        for (int i = 0; i < output.size(); i++) {
            x.append(output.get(i));
        }

        System.out.println("final is : " + x);
    }
}

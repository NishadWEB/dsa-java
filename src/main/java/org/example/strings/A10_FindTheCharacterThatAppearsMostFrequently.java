package org.example.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A10_FindTheCharacterThatAppearsMostFrequently {
    public static void main(String[] args) {
        String s = "banana";

        int maxCount = 0;
        int newCount = 1;

        List<Character> compared = new ArrayList<>();
        Map<Character, Integer> counts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char mostRepeatedChar = s.charAt(i);

            if(compared.contains(mostRepeatedChar)){
                continue;
            }

            compared.add(mostRepeatedChar);

            for (int j = i+1; j < s.length(); j++) {
                char c = s.charAt(j);

                if (c == mostRepeatedChar) {
                    newCount++;
                }
            }

            if(maxCount < newCount){
                maxCount = newCount;
            }

            counts.put(mostRepeatedChar, newCount);
        }

        counts.get(maxCount);

    }
}
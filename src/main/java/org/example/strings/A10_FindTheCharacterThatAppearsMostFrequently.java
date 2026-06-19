package org.example.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A10_FindTheCharacterThatAppearsMostFrequently {
    public static void main(String[] args) {
        String s = "nishad";

        int maxCount = 0;

        List<Character> compared = new ArrayList<>();
        Map<Character, Integer> counts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int newCount = 1;
            char mostRepeatedChar = s.charAt(i);

            if (compared.contains(mostRepeatedChar)) {
                continue;
            }

            compared.add(mostRepeatedChar);

            for (int j = i + 1; j < s.length(); j++) {
                char c = s.charAt(j);

                if (c == mostRepeatedChar) {
                    newCount++;
                }
            }

            if (maxCount < newCount) {
                maxCount = newCount;
            }

            counts.put(mostRepeatedChar, newCount);
        }

        if(maxCount == 1){
            System.out.println("Characters not repeated more that once.");
            return;
        }

        for(Map.Entry<Character, Integer> entry: counts.entrySet()){
            if(entry.getValue() == maxCount){
                System.out.println("The most frequently repeated character is : "+ entry.getKey() +" and it repeated "+ entry.getValue() + " times.");
                return;
            }
        }
    }
}
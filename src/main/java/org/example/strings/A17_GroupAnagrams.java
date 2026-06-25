package org.example.strings;

import java.util.*;

public class A17_GroupAnagrams {
    public static void main(String[] args) {
        String[] strArray = {"aab", "abb"};

        // store index of the strings who are already compared and got matched
        Set<Integer> visited = new HashSet<>();

        // to store the primary string with whom we are comparing againts
        Map<Character, Integer> currentString2 = new HashMap<>();

        //to store and print the anagram strings in each iteration
        List<String> arr = new ArrayList<>();

        for (int i = 0; i < strArray.length; i++) {
            if (visited.contains(i)) {
                continue;
            }

            String primaryStr = strArray[i];
            arr.add(primaryStr);

            for (int j = i + 1; j < strArray.length; j++) {
                if (!visited.contains(j)) {

                    if (primaryStr.length() == strArray[j].length()) {

                        // add comparing string characters to a map (for frequency checking)
                        currentString2.clear();

                        for (int k = 0; k < strArray[j].length(); k++) {
                            char c = strArray[j].charAt(k);

                            if (currentString2.containsKey(c)) {
                                currentString2.put(c, currentString2.get(c) + 1);
                            } else {
                                currentString2.put(c, 1);
                            }
                        }

                        // checking each character of strings
                        for (int k = 0; k < primaryStr.length(); k++) {

                            char c = primaryStr.charAt(k);

                            if (!currentString2.containsKey(c)) {
                                break;
                            }

                            // deduct by 1
                            currentString2.put(c, currentString2.get(c) - 1);

                            if (currentString2.get(c) == 0) {
                                currentString2.remove(c);
                            }

                            if (k == primaryStr.length() - 1 && currentString2.isEmpty()) {
                                arr.add(strArray[j]);
                                visited.add(j);
                            }
                        }

                    }

                }
            }

            System.out.println(arr);
            arr.clear();
        }
    }
}
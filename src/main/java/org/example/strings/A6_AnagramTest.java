package org.example.strings;

import java.util.ArrayList;
import java.util.List;

// Nested Loops + Visited Index Tracking
public class A6_AnagramTest {
    public static void main(String[] args) {
        String a = "aab";
        String b = "aabb";

        if(a.length() != b.length()){
            System.out.println("not anagram");
            return;
        }

        List<Integer> existingElement = new ArrayList<>();

        // take one element from a
        for (int i = 0; i < a.length(); i++) {
            boolean exists = false;

            // take one element from b
            for (int j = 0; j < b.length(); j++) {

                // check if the elementB is already compared and had put into exist
                if(existingElement.contains(j)){
                    continue;
                }

                // if not exists, then compare a and b
                if(a.charAt(i) == b.charAt(j)){
                    existingElement.add(j);
                    exists = true;
                    break;
                }
            }

            if(!exists){
                System.out.println("this is not anagram.");
                return;
            }
        }

        System.out.println("this is anagram.");
    }
}

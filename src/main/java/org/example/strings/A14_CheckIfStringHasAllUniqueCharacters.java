package org.example.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class A14_CheckIfStringHasAllUniqueCharacters {
    public static void main(String[] args) {
        String s = "abcda";

        Set<Character> visited = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(visited.contains(c)){
                System.out.println("not unqie");
                return;
            }
            visited.add(c);
        }

        System.out.println("yess unique");
    }
}

package org.example.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class A18_IsomorphicStrings {
    public static void main(String[] args) {
        String s = "aba";
        String t = "ccd";

        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }

        int length = s.length();

        Map<Character, Character> set = new HashMap<>();

        for (int i = 0; i < length; i++) {
            char c1 = s.charAt(i);

            if (!set.containsKey(c1)) {

                char c2 = t.charAt(i);

                if (!set.containsValue(c2)) {
                    set.put(c1, c2);
                }else {
                    System.out.println(false);
                    return;
                }

            } else if (set.get(c1) != t.charAt(i)) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }

}


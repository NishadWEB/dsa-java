package org.example.strings;

import java.util.ArrayList;
import java.util.List;

public class A8_ReverseTheOrderOfWordsInASentence {
    public static void main(String[] args) {
        String s = "love Java in my own way";
        List<String> reverse = new ArrayList<>();
        int lastCut = s.length();

        StringBuilder x2 = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {

            if (i == 0) {
                String word = s.substring(i, lastCut);
                x2.append(word);
                x2.append(' ');
            }

            if (s.charAt(i) != ' ') {
                continue;
            } else {
                String word = s.substring(i + 1, lastCut);
                lastCut = i;
                x2.append(word);
                x2.append(' ');
            }
        }

        System.out.println(x2);
    }
}

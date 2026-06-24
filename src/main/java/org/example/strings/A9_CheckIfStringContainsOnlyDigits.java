package org.example.strings;

// Character Validation
public class A9_CheckIfStringContainsOnlyDigits {
    public static void main(String[] args) {
        String s = "1231asd123";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' ||
                    s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' ||
                    s.charAt(i) == '7' || s.charAt(i) == '8' || s.charAt(i) == '9' ||
                    s.charAt(i) == '0') {
                continue;
            } else {
                System.out.println("this sentence also has WORDS.");
                return;
            }
        }

        System.out.println("this sentence only contains digits");
    }
}

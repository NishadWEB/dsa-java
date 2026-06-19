package org.example.strings;

public class A4_CountRepeatedLetter {

    public static void main(String[] args) {
        String s = "programmer";
        char c = 'm';
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if(c == s.charAt(i)){
                count++;
            }
        }

        System.out.println("count is : "+ count);
    }
}

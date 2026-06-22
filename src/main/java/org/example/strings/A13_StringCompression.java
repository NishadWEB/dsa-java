package org.example.strings;

public class A13_StringCompression {


    public static void compress(char c, int count, StringBuilder compressedString) {
        compressedString.append(c);
        if (count > 1) {
            compressedString.append(count);
        }
    }


    public static void main(String[] args) {
        String s = "adbcaaddb";

        char c = s.charAt(0);
        int count = 1;
        StringBuilder compressedString = new StringBuilder();

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == c) {
                count++;
            } else {
                // Appending process
                compress(c, count, compressedString);

                // reset the values
                c = s.charAt(i);
                count = 1;
            }
        }
        compress(c, count, compressedString);

        System.out.println(compressedString);
    }
}

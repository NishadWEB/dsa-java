package org.example.strings;

import java.util.HashSet;
import java.util.Set;

public class A16_LongestPalindromicSubstring {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "fhkjkmalayalamalayalhsdkjfhsdf";
        int strLength = str.length();

        StringBuilder maxStr = new StringBuilder();
        StringBuilder substr = new StringBuilder();

        for (int i = 0; i < strLength; i++) {

            for (int j = i; j < strLength; j++) {
                substr.append(str.charAt(j));

                if (isPalindrome(String.valueOf(substr))) {
                    if (substr.length() > maxStr.length()) {
                        maxStr.delete(0, maxStr.length());
                        maxStr.append(substr);
                    }
                }
            }
            substr.delete(0, substr.length());
        }

        System.out.println("longest palindromic substr is : "+ maxStr);
    }
}

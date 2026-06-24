package org.example.strings;

//Two Pointers (Start & End)
public class A2_Palindrome {
    public static void main(String[] args) {
        String s = "mam";
        int start = 0;
        int end = s.length() - 1;

        char valueAtStart;
        char valueAtEnd;

        while(start < end){
            valueAtStart = s.charAt(start);
            valueAtEnd = s.charAt(end);

            if(valueAtStart == valueAtEnd){
                start++;
                end--;
            }else {
                System.out.println("not a palindrome");
                return;
            }
        }
        System.out.println("palindrome");
    }
}

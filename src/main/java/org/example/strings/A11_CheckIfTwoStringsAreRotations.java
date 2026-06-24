package org.example.strings;

// String Rotation Simulation
public class A11_CheckIfTwoStringsAreRotations {
    public static void main(String[] args) {
        String first = "nishad";
        String second = "shadinasdas";


        if(first.equals(second)){
            System.out.println("Yes Rotations");
            return;
        }

        if(first.length() != second.length()){
            System.out.println("Not Rotations");
            return;
        }

        StringBuilder s = new StringBuilder(second);
        int count = 0;

        for (int i = 0; i < s.length(); ) {
            if(count == s.length() - 1){
                System.out.println("Not rotation.");
                return;
            }
            count++;

            char firstChar = s.charAt(i);

            s.deleteCharAt(i);

            s.append(firstChar);

            if(first.equals(s.toString())){
                System.out.println("Yes two strings are rotations");
                return;
            }
        }
    }
}

package org.example.strings;

public class A3_CountWords {
    public static void main(String[] args) {
        String para = "hello";
        char c;
        int count = 0;
        for (int i = 0; i < para.length(); i++) {
            c = para.charAt(i);
            if (c == ' ') {
                count++;
            }
        }
        if (count == 0 && !para.isEmpty()){
            System.out.println("word count is 1");
        }else if(count == 0){
            System.out.println("word count is 0");
        }else{
            count++;
            System.out.println("word count is : "+ count);
        }

    }
}

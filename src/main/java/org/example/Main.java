package org.example;

import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set<String> res = new HashSet<>();
        res.add("c");
        res.add("a");
        res.add("b");

        System.out.println(res + " - " + res.toArray().length);
    }
}
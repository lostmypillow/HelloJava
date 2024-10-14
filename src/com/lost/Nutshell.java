package com.lost;
import java.util.ArrayList;
import java.util.List;

public class Nutshell {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int bigger = x > y ? x : y;
        // ternary operator
        System.out.println(bigger);
        Integer i = 0;
        // int literal 0 boxed to an Integer object
        Number n = 0.0f;
        System.out.println(n);
        // float literal boxed to Float and widened to Number
        int j = i;
        System.out.println(j);
        // i is unboxed here
        i++;
        // i is unboxed, incremented, and then boxed up again
        Integer k = i + 2;
        System.out.println(k);
        // i is unboxed and the sum is boxed up again

        i = null;
        System.out.println(i);
        // j = i;

        // unboxing here throws a NullPointerException

        List<Integer> numbers  =  new ArrayList<>();
        // Create a List of Integer

        numbers.add(-1);

        // Box int to Integer

//        int i = numbers.get(0);

        // Unbox Integer to int
    }
}

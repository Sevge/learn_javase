package com.basic;

public class DiguiJiecheng {
    public static void main(String[] args) {
        System.out.print(f(30));
    }

    public static int f(int n) {
        if (n==1) {
            return 1;
        } else {
            return n * f(n-1);
        }
    }
}

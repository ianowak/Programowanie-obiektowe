package com.company;

import java.util.Scanner;

public class Silnia {
    private static int silnia(int x) {
        if (x < 1)
            return 1;
        else return x * silnia(x - 1);
    }

    public static void main(String[] args) {
        System.out.println("podaj liczbe");
        Scanner wejscie = new Scanner(System.in);
        int n = wejscie.nextInt();

        System.out.println(n + "! = " + silnia(n));
    }
}


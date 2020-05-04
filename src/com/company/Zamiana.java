package com.company;

import java.util.Scanner;

public class Zamiana {
    public static void main(String[] args) {
        double a, b, temp;
        Scanner wejscie = new Scanner(System.in);
        System.out.println("podaj pierwsza liczbe:");
        a = wejscie.nextInt();
        System.out.println("podaj druga liczbe:");
        b = wejscie.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("pierwsza liczba: " + a + "\ndruga liczba: " + b);

    }
}

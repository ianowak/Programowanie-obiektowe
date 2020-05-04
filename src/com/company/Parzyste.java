package com.company;

import java.util.Scanner;

public class Parzyste {

    public static void main(String[] args) {

        Scanner wejdz = new Scanner(System.in);
        System.out.println("podaj liczbe:");
        int liczba = wejdz.nextInt();
        if (liczba % 2 == 0)
            System.out.println("liczba jest parzysta");
        else
            System.out.println("liczba nieparzysta");
    }
}

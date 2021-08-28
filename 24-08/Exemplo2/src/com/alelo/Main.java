package com.alelo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        System.out.println("Voce inseriu uma string de valor "+S);
        int a = in.nextInt();
        System.out.println("Voce inseriu um interger de valor"+a);
        float  b = in.nextFloat();
        System.out.println("Voce inseriu um Float de valor"+b);
    }
}

package com.alelo;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("--------------------- EXE 3--------------");
        System.out.println("Digite Base :");
        Scanner sd = new Scanner(System.in);
        double base = sd.nextDouble();

        System.out.println("Digite Altura :");
        Scanner sb = new Scanner(System.in);
        double altura = sb.nextDouble();

        System.out.println("RESPOSTA :"+((base * altura)/2));

        sb.close();;
        System.out.println("-----------------FIM EXE 3---------------");
    }
}

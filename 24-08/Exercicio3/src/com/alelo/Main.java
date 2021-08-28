package com.alelo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float retangulo;

        Scanner ext_base = new Scanner(System.in);
        System.out.println("Escreva a Base do Retangulo");
        float base = ext_base.nextInt();

        Scanner ext_altura = new Scanner(System.in);
        System.out.println("Escreva a Altura do Retangulo");
        float  altura = ext_altura.nextFloat();

        retangulo = base * altura;
        System.out.println("O quadrado eh: "+retangulo);

    }
}

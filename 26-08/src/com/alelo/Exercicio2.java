package com.alelo;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("--------------------- EXE 2---------------");
        System.out.println("Digite seu numero :");
        Scanner scanner = new Scanner(System.in);
        Integer numero = scanner.nextInt();

        System.out.println("Numero antecessor "+--numero);
        // mostrar o antecessor
        scanner.close();;
        System.out.println("-----------------FIM EXE 2---------------");
    }
}

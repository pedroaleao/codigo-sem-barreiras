package com.alelo;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        System.out.println("--------------------- EXE 4--------------");
        System.out.println("Quantos eletores tem no municipio :");
        Scanner sd = new Scanner(System.in);
        int votoTotais = sd.nextInt();

        System.out.println("Digite a quantidade de votos :");
        int votosValidos = sd.nextInt();cxc

        System.out.println("Digite os votos brancos :");
        int votosBrancos = sd.nextInt();

        System.out.println("Digite os votos nulos :");
        int votoNulos = sd.nextInt();

        System.out.printf("Total de votos : %.2f%%%n",(votoTotais * 100.00)/ votoTotais);
        System.out.printf("Votos Validos : %.2f%%%n",(votosValidos * 100.00)/ votoTotais);
        System.out.printf("Votos Brancos : %.2f%%%n",(votosBrancos * 100.00)/ votoTotais);
        System.out.printf("Votos Nulos : %.2f%%%n",(votoNulos * 100.00)/ votoTotais);


        sd.close();
        System.out.println("-----------------FIM EXE 4---------------");
    }
}

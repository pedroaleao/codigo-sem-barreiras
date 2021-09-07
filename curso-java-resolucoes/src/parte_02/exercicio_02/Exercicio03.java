package parte_02.exercicio_02;

import java.util.ArrayList;
import java.util.Scanner;

// 3 - Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números pares.
public class Exercicio03 {

    public static void comLista() {

        try (Scanner in = new Scanner(System.in)) {
            var programaDeveContinuarExecutando = true;

            var numeros = new ArrayList<Integer>();

            while (programaDeveContinuarExecutando) {
                System.out.println("Digite um novo número");
                numeros.add(in.nextInt());

                System.out.println("Deseja adicionar mais um número? [s], [n]");
                if (in.next().charAt(0) == 'n') {
                    programaDeveContinuarExecutando = false;
                }
            }

                    numeros.stream().filter(numero -> numero % 2 == 0) // Se quiser filtrar somente pares, remova os comentários desta linha
                    .forEach(System.out::println);
        }


    }



    public static void main(String[] args) {
         comLista();

    }

}

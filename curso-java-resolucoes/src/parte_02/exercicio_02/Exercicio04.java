package parte_02.exercicio_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

// 4 - Escreva um algoritmo que leia números, insira em um array e após mostre o maior valor.
public class Exercicio04 {

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
                    //pegando o maaior numero atravez de collections
                    int maior = Collections.max(numeros);
                    System.out.println(maior);
        }


    }



    public static void main(String[] args) {
         comLista();

    }

}

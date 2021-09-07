package parte_02.exercicio_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*5 - Escreva um algoritmo que simula um jogo da forca simples. o usuario precisara adivinhar uma palavra chutando cada
letra em no máximo 10 chutes, caso o usuario acerte a letra o jogo dirá que ele acertou, caso tenha errado, o numero de
tentativas vai diminuindo. Caso o numero de tentativas chegue a 0 o usuário perde.*/

public class Exercicio05 {

    public static void forca() {
        try (var scanner = new Scanner(System.in)) {
            var tentativas = 10;

            String[] palavras = {"Banana","Macarao","Abacaxi","Macaco","Limao","Casa","Listra"};

            int posicao = (int) (Math.random() * palavras.length);
            var palavra = palavras[posicao];
            var palavraRevelada = "";

            for (int i = 0; i < palavra.length(); i++) {
                palavraRevelada += "-";
            }

            var palavraAcertada = false;
            var quantidadeDeLetrasAcertadas = 0L;

            while (tentativas > 0 && !palavraAcertada) {
                var houveAcerto = false;
                System.out.println("Digite uma letra");
                char letra = scanner.next().toLowerCase().charAt(0);

                for (int i = 0; i < palavra.length(); i++) {
                    if (palavra.charAt(i) == letra) {

                        // Com o uso de array
                        var palavraReservadaArray = palavraRevelada.toCharArray();
                        palavraReservadaArray[i] = palavra.charAt(i);
                        palavraRevelada = new String(palavraReservadaArray);
                        houveAcerto = true;
                        quantidadeDeLetrasAcertadas++;


                    }
                }

                if (!houveAcerto) {
                    tentativas--;
                }

                if (quantidadeDeLetrasAcertadas == palavra.length()) {
                    palavraAcertada = true;
                }

                System.out.println(palavraRevelada);
                System.out.println(tentativas);

            }
        }

    }



    public static void main(String[] args) {
        forca();

    }

}

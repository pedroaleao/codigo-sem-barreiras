package com.meli.recursao;

//Recursiva Utilizando o Operador Ternário
public class Fibonacci3 {

    static long fibo(int n) {
        return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
    }


    public static void main(String[] args) {

        // teste do programa. Imprime os 30 primeiros termos
        for (int i = 0; i < 30; i++) {
            System.out.print("(" + i + "):" + Fibonacci3.fibo(i) + "\t");
        }

    }

}

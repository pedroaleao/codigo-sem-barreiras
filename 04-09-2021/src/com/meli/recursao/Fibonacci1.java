package com.meli.recursao;

//Recursiva Tradicional
public class Fibonacci1 {

    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            //  return fibo(n - 1) + fibo(n - 2);
              return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {

        // teste do programa. Imprime os 30 primeiros termos
        for (int i = 1; i < 30; i++) {
            System.out.println("(" + i + "):" + Fibonacci1.fibo(i) + "\t");
        }

    }

}





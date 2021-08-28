package com.alelo;

public class Exercicio1 {
    public static void main(String[] args) {
        // write your code here
        byte y = 11;
        byte z = 99;
        byte  troca = 0;

        System.out.println("-----------------EXE 1------------------");
        System.out.println("Y= "+y+" Z="+z);
        troca = y;
        y = z;
        z = troca;
        System.out.println("Y= "+y+" Z="+z);
        System.out.println("-----------------FIM EXE 1---------------");
    }
}

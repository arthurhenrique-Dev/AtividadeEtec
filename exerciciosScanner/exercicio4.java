package org.example;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {


        Scanner entradaX = new Scanner(System.in);
        Scanner entradaY = new Scanner(System.in);

        System.out.println("Digite o X");
        int x = entradaX.nextInt();
        System.out.println("Digite o Y");
        int y = entradaY.nextInt();
        System.out.println("Está em (" + x + ", " + y + ")");

    }
}


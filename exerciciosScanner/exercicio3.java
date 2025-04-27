package org.example;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o codigo do produto");
        int resposta = entrada.nextInt();
        switch (resposta) {
            case 1:
                System.out.println("Alimento");
                break;
            case 2:
                System.out.println("Limpeza");
                break;
            case 3:
                System.out.println("Vestuario");
                break;
        }

    }
}

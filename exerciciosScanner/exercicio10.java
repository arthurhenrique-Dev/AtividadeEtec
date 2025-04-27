package org.example;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner inFrequencia = new Scanner(System.in);
        Scanner inNota = new Scanner(System.in);
        double Frequencia = 0;
        double nota = 0;
        System.out.println("Digite o valor da frequencia");
        Frequencia = inFrequencia.nextDouble();
        System.out.println("Digite o valor da nota");
        nota = inNota.nextDouble();
        if (Frequencia > 75 && nota > 7) {
            System.out.println("aprovado");
        }
        else {
            System.out.println("reprovado");
        }

    }
}

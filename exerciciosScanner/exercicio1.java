package org.example;


import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = leitor.nextInt();
        int faixaIdade = 0;
        if (idade >= 0  && idade <= 12) {
            faixaIdade = 1;
        }
        else if (12> idade && idade < 18) {
            faixaIdade = 2;
        }
        else if (18>= idade && idade <= 59) {
            faixaIdade = 3;
        }
        else if (59> idade) {
            faixaIdade = 4;
        }
        else {
            System.out.println("idade invalida");
        }
        switch (faixaIdade) {
            case 1:
                System.out.println("criança");
                break;
            case 2:
                System.out.println("adolescente");
                break;
            case 3:
                System.out.println("adulto");
                break;
            case 4:
                System.out.println("idoso");
                break;

        }

    }
}

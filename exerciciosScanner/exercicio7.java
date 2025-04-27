package org.example;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner entradaPessoas = new Scanner(System.in);
        Scanner entradaConta = new Scanner(System.in);
        double pessoas = 0;
        double conta = 0;
        double resultado = 0;
        System.out.println("Digite quantas pessoas irão pagar");
        pessoas = entradaPessoas.nextDouble();
        System.out.println("Digite o valor da conta");
        conta = entradaConta.nextDouble();
        resultado = conta/pessoas;
        System.out.println("Este é o valor de cada pessoa: " + resultado);

    }
}

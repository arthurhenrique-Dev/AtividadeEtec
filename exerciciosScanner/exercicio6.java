package org.example;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner entradaPreço = new Scanner(System.in);
        Scanner entradaDesconto= new Scanner(System.in);
        double preço = 0;
        double desconto = 0;
        System.out.println("Informe o preço e o desconto");
        preço = entradaPreço.nextDouble();
        desconto = entradaDesconto.nextDouble();
        double precoDescontado = preço - (preço * (desconto / 100));
        System.out.println("O preço fica " + precoDescontado);
    }
}

package org.example;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner entradaAltura = new Scanner(System.in);
        Scanner entradaLargura = new Scanner(System.in);
        double altura = 0;
        double largura = 0;
        double area = 0;
        System.out.println("Digite a altura do retangulo");
        altura = entradaAltura.nextDouble();
        System.out.println("Digite a largura do retangulo");
        largura = entradaLargura.nextDouble();
        area = altura * largura;
        System.out.println("a area é " + area);
    }
}

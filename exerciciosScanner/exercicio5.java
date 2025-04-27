package org.example;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner entradaSalario = new Scanner(System.in);
        System.out.println("Digite o salario bruto");
        double salarioBruto = entradaSalario.nextDouble();
        double salarioLiquido = 0;
        int indexFaixaSalario = 0;
        if (salarioBruto >= 0 && salarioBruto <= 1518) {
            indexFaixaSalario = 1;
        }
        else if (salarioBruto > 1518 && salarioBruto <= 2793.88) {
            indexFaixaSalario = 2;
        }
        else if (salarioBruto > 2793.88 && salarioBruto <= 4190.83) {
            indexFaixaSalario = 3;
        }
        else if (salarioBruto > 4190.83) {
            indexFaixaSalario = 4;
        }

        switch (indexFaixaSalario) {
            case 1:
                salarioLiquido = salarioBruto * 0.925;
                break;
            case 2:
                salarioLiquido = salarioBruto * 0.91;
                break;
            case 3:
                salarioLiquido = salarioBruto * 0.88;
                break;
            case 4:
                salarioLiquido = salarioBruto * 0.86;
                break;
        }
        System.out.println(salarioLiquido);
    }
}

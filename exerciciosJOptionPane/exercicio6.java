package org.example.exerciciosJOptionPane;

import javax.swing.*;

public class exercicio6 {
    public static void main(String[] args) {
        double n1, n2, resultado;
        int sinal = 0;
        String n1Str = JOptionPane.showInputDialog("Digite o primeiro número: ");
        n1 = Double.parseDouble(n1Str);
        String n2Str = JOptionPane.showInputDialog("Digite o segundo número: ");
        n2 = Double.parseDouble(n2Str);
        String sinalStr = JOptionPane.showInputDialog("deseja fazer que soma (multiplicação, adição, subtração e divisão");
        if (sinalStr.equals("multiplicação")) {
            sinal = 1;
        }
        else if (sinalStr.equals("adição")){
            sinal = 2;
        }
        else if (sinalStr.equals("subtração")){
            sinal = 3;
        } else if (sinalStr.equals("divisão")) {
            sinal = 4;
        }
        switch (sinal) {
            case 1:
                resultado = n1 * n2;
                JOptionPane.showMessageDialog(null, resultado);
                break;
            case 2:
                resultado = n1 + n2;
                JOptionPane.showMessageDialog(null, resultado);
                break;
            case 3:
                resultado = n1 - n2;
                JOptionPane.showMessageDialog(null, resultado);
                break;
            case 4:
                resultado = n1 / n2;
                JOptionPane.showMessageDialog(null, resultado);
                break;
            default:
                JOptionPane.showMessageDialog(null, "escreva literalmente como eu escrevi");
        }
    }
}

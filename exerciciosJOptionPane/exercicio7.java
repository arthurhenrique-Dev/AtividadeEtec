package org.example.exerciciosJOptionPane;

import javax.swing.*;

public class exercicio7 {
    public static void main(String[] args) {
        double altura, peso, imc;
        String alturaStr = JOptionPane.showInputDialog("Informe a altura: ");
        altura = Double.parseDouble(alturaStr);
        String pesoStr = JOptionPane.showInputDialog("Informe a peso: ");
        peso = Double.parseDouble(pesoStr);
        imc = peso / (altura*altura);
        JOptionPane.showMessageDialog(null,"O seu imc é " + imc);
    }
}

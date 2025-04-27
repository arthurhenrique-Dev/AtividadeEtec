package org.example.exerciciosJOptionPane;

import javax.swing.*;

public class exercicio9 {
    public static void main(String[] args) {
        double numero;
        String numeroStr  = JOptionPane.showInputDialog("Digite um numero: ");
        numero = Double.parseDouble(numeroStr);
        if (numero >= 10 && numero <= 20) {
            JOptionPane.showMessageDialog(null,"Esta no intervalo");
        }
        else {
            JOptionPane.showMessageDialog(null, "Está fora do interavalo");
        }
    }
}

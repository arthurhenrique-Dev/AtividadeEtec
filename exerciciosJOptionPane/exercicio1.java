package org.example.exerciciosJOptionPane;

import javax.swing.*;

public class exercicio1 {
    public static void main(String[] args) {
        int numero = 0;
        String numeroStr = (JOptionPane.showInputDialog("Informe um número e eu responderei se é positivo ou negativo"));
        numero = Integer.parseInt(numeroStr);
        if (numero > 0){
            JOptionPane.showMessageDialog(null,"positivo");
        }
        else if (numero == 0){
            JOptionPane.showMessageDialog(null,"neutro");
        }
        else if (numero < 0){
            JOptionPane.showMessageDialog(null,"negativo");
        }

    }
}

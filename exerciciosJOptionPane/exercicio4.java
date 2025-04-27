package org.example.exerciciosJOptionPane;

import javax.swing.*;

public class exercicio4 {
    public static void main(String[] args) {
        int n;
        String s = JOptionPane.showInputDialog("Informe um número: ");
        n = Integer.parseInt(s);
        if (n % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número é par");
        } else
            JOptionPane.showMessageDialog(null, "O número é impar");
    }
}
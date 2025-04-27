package org.example.exerciciosJOptionPane;

import javax.swing.*;

public class exercicio3 {
    public static void main(String[] args) {
        int n1, n2;
        int verificaçaoSinal = 0;
        String s1 = JOptionPane.showInputDialog("Informe um número: ");
        n1 = Integer.parseInt(s1);
        String s2 = JOptionPane.showInputDialog("Informe outro número: ");
        n2 = Integer.parseInt(s2);
        verificaçaoSinal = n1 - n2;
        if (verificaçaoSinal > 0){
            JOptionPane.showMessageDialog(null, "O primeiro número é maior");
        }
        else if (verificaçaoSinal < 0){
            JOptionPane.showMessageDialog(null, "O segundo número é maior");
        }
        else {
            JOptionPane.showMessageDialog(null, "eles são iguais");

        }
    }
}

package org.example.exerciciosJOptionPane;

import javax.swing.*;

public class exercicio2 {
    public static void main(String[] args) {
        double nota = 0;
        String notaStr = JOptionPane.showInputDialog("Digite um nota: ");
        nota = Double.parseDouble(notaStr);
        if (nota >= 7) {
            JOptionPane.showMessageDialog(null, "Aprovado");
        }
        else if (nota < 7 && nota <= 5 ){
            JOptionPane.showMessageDialog(null,"Recuperação");
        }
        else{
            JOptionPane.showMessageDialog(null,"Reprovado");
        }
    }
}

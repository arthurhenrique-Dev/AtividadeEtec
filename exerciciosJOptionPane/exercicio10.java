package org.example.exerciciosJOptionPane;

import javax.swing.*;

public class exercicio10 {
    public static void main(String[] args) {
        int idade;
        String idadeStr = JOptionPane.showInputDialog("Digite sua idade");
        idade = Integer.parseInt(idadeStr);
        if (idade >= 16) {
            JOptionPane.showMessageDialog(null,"pode votar");
        }
        else {
            JOptionPane.showMessageDialog(null,"não pode votar");
        }
    }
}

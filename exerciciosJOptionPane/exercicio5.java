package org.example.exerciciosJOptionPane;

import javax.swing.*;

public class exercicio5 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
        int indexNumeroDeNotas = 3;
        String n1 = JOptionPane.showInputDialog("Digite a primeira nota: ");
        nota1 = Double.parseDouble(n1);
        String n2 = JOptionPane.showInputDialog("Digite a segunda nota: ");
        nota2 = Double.parseDouble(n2);
        String n3 = JOptionPane.showInputDialog("Digite a terceira nota: ");
        nota3 = Double.parseDouble(n3);
        media = (nota1 + nota2 + nota3) / indexNumeroDeNotas;
        JOptionPane.showMessageDialog(null, "A média é " + media);


    }
}

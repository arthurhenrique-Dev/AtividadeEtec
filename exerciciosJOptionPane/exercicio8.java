package org.example.exerciciosJOptionPane;

import javax.swing.*;

public class exercicio8 {
    public static void main(String[] args) {
        double celsius, fahrenheit;
        String celsiusStr;
        celsiusStr = JOptionPane.showInputDialog("Fale a temperatura em celsius");
        celsius = Double.parseDouble(celsiusStr);
        fahrenheit = celsius*1.8 + 32;
        JOptionPane.showMessageDialog(null,"Essa temperatura é " + fahrenheit + " em fahrenheit");
    }
}

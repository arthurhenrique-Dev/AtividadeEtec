package org.example;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a senha");
        String entradaSenha = leitor.nextLine();
        if (entradaSenha.equals("java123")) {
            System.out.println("Acesso permitido");
        }
        else {
            System.out.println("Senha incorreta");
        }
    }
}

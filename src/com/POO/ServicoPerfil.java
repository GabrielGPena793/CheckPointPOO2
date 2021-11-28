package com.POO;

import java.util.List;
import java.util.Scanner;

public class ServicoPerfil {
    Scanner scanner = new Scanner(System.in);

    public void atualizarDados(int escolha, Usuario user){

        int idade = 0;
        String mudanca;
        switch (escolha) {
            case 1 -> {
                System.out.println("Digite seu novo Nome:");
                mudanca = scanner.nextLine();
                ((Cliente) user).setNome(mudanca);
            }
            case 2 -> {
                System.out.println("Digite seu novo Email:");
                mudanca = scanner.nextLine();
                user.setEmail(mudanca);
            }
            case 3 -> {
                System.out.println("Digite sua nova Senha:");
                mudanca = scanner.nextLine();
                user.setSenha(mudanca);
            }
            case 4 -> {
                System.out.println("Digite seu novo Gênero:");
                mudanca = scanner.nextLine();
                ((Cliente) user).setGenero(mudanca);
            }
            case 5 -> {
                System.out.println("Digite seu novo Idade:");
                idade = scanner.nextInt();
                ((Cliente) user).setIdade(idade);
            }
            default -> System.out.println("Digite um número de 1 a 5");
        }
    }

}

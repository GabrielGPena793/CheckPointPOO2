package com.POO;

import java.util.Scanner;

public class ExibirPefil {

    Scanner scanner = new Scanner(System.in);
    ServicoPerfil servicoPerfil = new ServicoPerfil();

    public void telaPerfil(Usuario user){ // responsavel por mostar o menu de perfil
        int escolha = 0;

        while (escolha != 3) {
            System.out.println("---------------------");
            System.out.println("""
                    Perfil, Digite:\s
                    1 - Atualizar Dados\s
                    2 - Mostrar Dados\s
                    3 - Sair do perfil""");
            System.out.println("---------------------");

            escolha = scanner.nextInt();

            if (escolha == 1) {
                this.telaAtualizarDados(user); // chamando a função que irá mostrar a tela de atualização
            } else if (escolha == 2) {
                this.telaDetalhesDados(user); // chamando a função que irá mostrar a tela de detalhes
            } else if(escolha == 3) {
                System.out.println("Voltando para o menu");
            }
        }
    }

    public void telaAtualizarDados(Usuario user){ // responavel por mostrar a tela de atualização
        int escolha;

        do {
            System.out.println("---------------------");
            System.out.println("""
                    O que deseja atualizar ?
                    1 - Nome
                    2 - Email
                    3 - Senha
                    4 - Gênero
                    5 - Idade""");
            System.out.println("---------------------");
            escolha = scanner.nextInt();

            servicoPerfil.atualizarDados(escolha, user); // chamando a função responsavel por atuallizar os dados

            System.out.println("Perfil atualizado com sucesso!");

            System.out.println("---------------------");
            System.out.println("""
                    Deseja continuar atualizando?
                    1 - sim\s
                    2 - não""");
            System.out.println("---------------------");
            escolha = scanner.nextInt();

        }while (escolha != 2);
    }

    public void telaDetalhesDados(Usuario user){ // responsável por mostara a tela de detalhes

        System.out.println("---------------------");

        System.out.println("Seu perfil:" +
                "\nNome: " + ((Cliente) user).nome +
                "\nIdade: " + ((Cliente) user).idade +
                "\nGênero: " + ((Cliente) user).genero +
                "\nEmail: " + user.email +
                "\nData de Registro: " + user.dataRegistro);
        System.out.println("---------------------");

        int sair = 0;
        while (sair != 1){
            System.out.println("1 - Sair dos detalhes do perfil");
            sair = scanner.nextInt();
        }
    }
}

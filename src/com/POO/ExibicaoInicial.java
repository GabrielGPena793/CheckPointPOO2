package com.POO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExibicaoInicial implements IExibicaoInicial {
    SevicosUsuario sevicosUsuario = new SevicosUsuario();
    MenuExibicao menuExibicao = new MenuExibicao();
    Usuario user = new Cliente();

    public ExibicaoInicial(){}

    public void telaInicial() throws InputMismatchException { // responsavel por dar opções iniciais do app
        Scanner scanner = new Scanner(System.in);
        int opacao = 0;

        while (opacao != 3) {
            System.out.println("---------------------");
            System.out.println("""
                    Bem vindo, ao AppTatoo, digite:\s
                    1 - Fazer Login\s
                    2 - Cadastrar\s
                    3 - Sair da aplicação""");
            System.out.println("---------------------");
            opacao = scanner.nextInt();

            if (opacao == 1) {
                this.telaLogin(); // chamando a função responsavel por mostar a tela de login
            } else if (opacao == 2) {
                this.telaCadastro(); // chamando a função responsavel por mostar a tela de cadastro
            } else if(opacao == 3) {
                System.out.println("Programa encerrado!");
            }else if(opacao > 3) {
                System.out.println("Digite um número entre 1 a 3");
            }
        }
    }

    public void telaLogin(){ // responsavel por printar o menu de login
        Scanner scanner = new Scanner(System.in);
        String email, senha;

        do {
            System.out.println("---------------------");
            System.out.println("Digite seu email:");
            email = scanner.nextLine();

            System.out.println("Digite sua senha:");
            senha = scanner.nextLine();
            System.out.println("---------------------");

            if (email.equals("") || senha.equals("")){
                System.out.println("Não pode haver campos vazios!");
        }

        }while (email.equals("") || senha.equals(""));

        boolean login = sevicosUsuario.verificarLogin(email, senha, this.user); // chamando a função responsavel por verificar se está cadastrado

        if (login){
            System.out.println("Login efetuado com sucesso!");
            menuExibicao.telaMenu(this.user);
        }else{
            System.out.println("Login inválido!");
        }

    }

    public void telaCadastro(){ // responsavel por printar o menu de cadastro
        Scanner scanner = new Scanner(System.in);
        String email, senha, nome,genero;
        int idade;

        System.out.println("Digite seu email:");
        email = scanner.nextLine();
        System.out.println("Digite sua senha:");
        senha = scanner.nextLine();
        System.out.println("Digite seu nome:");
        nome = scanner.nextLine();
        System.out.println("Digite seu gênero:");
        genero = scanner.nextLine();
        System.out.println("Digite sua idade:");
        idade = scanner.nextInt();

        sevicosUsuario.cadastrar(email, senha, nome, genero, idade, this.user); // chamando a função responsavel por cadastrar o cliente

        System.out.println("Cadastro realizado com sucesso!");
    }
}

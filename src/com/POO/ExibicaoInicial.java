package com.POO;

import java.util.Scanner;

public class ExibicaoInicial implements IExibicaoInicial {
    SevicosUsuario sevicosUsuario = new SevicosUsuario();
    MenuExibicao menuExibicao = new MenuExibicao();
    Usuario user = new Cliente();

    public ExibicaoInicial(){}

    public void telaInicial(){
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
                this.telaLogin();
            } else if (opacao == 2) {
                this.telaCadastro();
            } else if(opacao == 3) {
                System.out.println("Programa encerrado!");
            }
        }
    }

    public void telaLogin(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------");
        System.out.println("Digite seu email:");
        String email = scanner.nextLine();

        System.out.println("Digite sua senha:");
        String senha = scanner.nextLine();
        System.out.println("---------------------");

        boolean login = sevicosUsuario.verificarLogin(email, senha, this.user);

        if (login){
            System.out.println("Login efetuado com sucesso!");
            menuExibicao.telaMenu(this.user);
        }else{
            System.out.println("Login inválido!");
        }

    }

    public void telaCadastro(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu email:");
        String email = scanner.nextLine();
        System.out.println("Digite sua senha:");
        String senha = scanner.nextLine();
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite seu gênero:");
        String genero = scanner.nextLine();
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        sevicosUsuario.cadastrar(email, senha, nome, genero, idade, this.user);

        System.out.println("Cadastro realizado com sucesso!");
    }
}

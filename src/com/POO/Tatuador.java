package com.POO;

import java.util.Scanner;

public class Tatuador extends Usuario{

    private String nome, endereco, telefone, cep;

    //constructor
    public Tatuador(String email, String senha, String nome, String endereco, String cep, String telefone) {
        super(email, senha);
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
        this.telefone = telefone;
    }

    public Tatuador(){
        super();
    };

    //Gettres e Setters =================


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void atualizarDados(){
        String escolha;
        String alteracao;
        Scanner scanner = new Scanner(System.in);
        System.out.println("O que você deseja atualizar?");
        escolha = scanner.nextLine();

        switch (escolha) {
            case "nome" -> {
                System.out.println("Digite seu novo nome:");
                alteracao = scanner.nextLine();
                setNome(alteracao);
            }
            case "email" -> {
                System.out.println("Digite seu novo email:");
                alteracao = scanner.nextLine();
                setEmail(alteracao);
            }
            case "senha" -> {
                System.out.println("Digite sua nova senha:");
                alteracao = scanner.nextLine();
                setSenha(alteracao);
            }
            case "cep" -> {
                System.out.println("Digite seu novo cep:");
                alteracao = scanner.nextLine();
                setCep(alteracao);
            }
            case "telefone" -> {
                System.out.println("Digite seu novo telefone:");
                alteracao = scanner.nextLine();
                setTelefone(alteracao);
            }
            case "endereco" -> {
                System.out.println("Digite seu novo endereco:");
                alteracao = scanner.nextLine();
                setEndereco(alteracao);
            }
            default -> System.out.println("Opção inválida!");
        }
        if(escolha.equals("nome") || escolha.equals("endereco") || escolha.equals("email") || escolha.equals("telefone")||
        escolha.equals("cep") || escolha.equals("senha")){
            System.out.println(escolha + " Atualizado com sucesso!");
        }
    }

}

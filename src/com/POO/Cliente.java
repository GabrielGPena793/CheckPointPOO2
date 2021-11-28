package com.POO;

import java.util.Objects;

public class Cliente  extends Usuario{

    String nome, genero;
    int idade;

    public Cliente(String email, String senha, String nome, String genero, int idade) {
        super(email, senha);
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    public Cliente() {
        super();
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

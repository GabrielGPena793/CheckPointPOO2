package com.POO;

import java.util.List;

public class SevicosUsuario {

    public SevicosUsuario(){};

    public boolean verificarLogin(String email, String senha, Usuario user){

        if (user.getEmail() != null){
            return true;
        }
        return false;

    }

    public void cadastrar(String email, String senha,String nome, String genero, int idade, Usuario user){

        user.setEmail(email);
        user.setSenha(senha);
        ((Cliente) user).setGenero(genero);
        ((Cliente) user).setIdade(idade);
        ((Cliente) user).setNome(nome);


    }

}

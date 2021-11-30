package com.POO;


import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        ExibicaoInicial exibirLogin = new ExibicaoInicial();
        try {
            exibirLogin.telaInicial();   // função incial onde irá interagir com as outras classes.


        }catch (InputMismatchException exibirPerfilException){

            System.err.println("ERROR!, DIGITE APENAS NÚMEROS NAS OPÇÕES" +
                    "\n Rode novamente o programa");

        }
    }
}

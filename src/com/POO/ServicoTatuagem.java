package com.POO;

public class ServicoTatuagem {

    // responsavel por fazer o calculo das tatuagens Tribal
    public void precoTribal(int tamanho, Tatuagem tatuagem){

        if (tamanho == 1){
            tatuagem.setTamanho("Pequena");
            tatuagem.setTipo("Tribal");
            tatuagem.setPrecoPequena(tatuagem.getPrecoPequena() * 2);
        }
        if(tamanho == 2){
            tatuagem.setTamanho("Média");
            tatuagem.setTipo("Tribal");
            tatuagem.setPrecoMedia(tatuagem.getPrecoMedia() * 3);
        }
        if(tamanho == 3){
            tatuagem.setTamanho("Grande");
            tatuagem.setTipo("Tribal");
            tatuagem.setPrecoGrande(tatuagem.getPrecoGrande() * 4);
        }
    }

    // responsavel por fazer o calculo das tatuagens OldSchool
    public void precoOldSchool(int tamanho, Tatuagem tatuagem){

        if (tamanho == 1){
            tatuagem.setTamanho("Pequena");
            tatuagem.setTipo("Old School");
            tatuagem.setPrecoPequena(tatuagem.getPrecoPequena() + 25);
        }
        if(tamanho == 2){
            tatuagem.setTamanho("Média");
            tatuagem.setTipo("Old School");
            tatuagem.setPrecoMedia(tatuagem.getPrecoMedia() + 75);

        }
        if(tamanho == 3){
            tatuagem.setTamanho("Grande");
            tatuagem.setTipo("Old School");
            tatuagem.setPrecoGrande(tatuagem.getPrecoGrande() + 120);

        }
    }

    // responsavel por fazer o calculo das tatuagens NewSchool
    public void precoNewSchool(int tamanho, Tatuagem tatuagem){

        if (tamanho == 1){
            tatuagem.setTamanho("Pequena");
            tatuagem.setTipo("New School");
            tatuagem.setPrecoPequena(tatuagem.getPrecoPequena() + 50);

        }
        if(tamanho == 2){
            tatuagem.setTamanho("Média");
            tatuagem.setTipo("New School");
            tatuagem.setPrecoMedia(tatuagem.getPrecoMedia() + 100);

        }
        if(tamanho == 3){
            tatuagem.setTamanho("Grande");
            tatuagem.setTipo("New School");
            tatuagem.setPrecoGrande(tatuagem.getPrecoGrande() + 150);
        }

    }

    // responsavel por fazer o calculo das tatuagens padrão
    public void precoPadrao( int tamanho, Tatuagem tatuagem){

        if (tamanho == 1){
            tatuagem.setTamanho("Pequena");
            tatuagem.setTipo("Outro tipo");
        }
        if(tamanho == 2){
            tatuagem.setTamanho("Média");
            tatuagem.setTipo("Outro tipo");
        }
        if(tamanho == 3){
            tatuagem.setTamanho("Grande");
            tatuagem.setTipo("Outro tipo");
        }

    }
}

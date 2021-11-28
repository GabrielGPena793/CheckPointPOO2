package com.POO;

public class Tatuagem {

    private String tamanho;
    private String tipo;
    private double precoPequena = 80,  precoMedia = 150, precoGrande = 350;

    public Tatuagem(String tamanho, String tipo) {
        this.tamanho = tamanho;
        this.tipo = tipo;
    }

    public Tatuagem() {
    }

    @Override
    public String toString() {
        return "Tatuagem: " +
                "tamanho " + this.tamanho +
                ", tipo " + this.tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecoPequena() {
        return precoPequena;
    }

    public void setPrecoPequena(double precoPequena) {
        this.precoPequena = precoPequena;
    }

    public double getPrecoMedia() {
        return precoMedia;
    }

    public void setPrecoMedia(double precoMedia) {
        this.precoMedia = precoMedia;
    }

    public double getPrecoGrande() {
        return precoGrande;
    }

    public void setPrecoGrande(double precoGrande) {
        this.precoGrande = precoGrande;
    }
}

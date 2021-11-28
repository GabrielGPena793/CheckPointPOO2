package com.POO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agendamento {

    private int dia, mes, hora;
    private List<Cliente> users = new ArrayList<>();
    private List<Tatuagem> tatuagems = new ArrayList<>();


    public Agendamento(int dia, int mes, int hora) {
        this.dia = dia;
        this.mes = mes;
        this.hora = hora;
    }

    public Agendamento() {
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
}

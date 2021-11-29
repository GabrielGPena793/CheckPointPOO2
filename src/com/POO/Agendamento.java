package com.POO;

import java.time.LocalDate;

public class Agendamento {

    private LocalDate data;
    private int hora;

    public Agendamento(LocalDate data, int hora) {
        this.data = data;
        this.hora = hora;
    }

    public Agendamento() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
}

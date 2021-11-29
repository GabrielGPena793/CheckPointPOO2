package com.POO;

import java.time.LocalDate;

public class ServicoAgendamento {
    ServicoTatuagem servicoTatuagem = new ServicoTatuagem();

    public void agendar(int tamanho, int tipo, int dia, int mes, int hora, Tatuagem tatuagem, Agendamento agendamento){

        switch (tipo) {
            case 1 -> servicoTatuagem.precoTribal(tamanho, tatuagem);
            case 2 -> servicoTatuagem.precoOldSchool(tamanho, tatuagem);
            case 3 -> servicoTatuagem.precoNewSchool(tamanho, tatuagem);
            case 4 -> servicoTatuagem.precoPadrao(tamanho, tatuagem);
            default -> System.out.println("Escolha uma opção válida!");
        }

        agendamento.setData(LocalDate.of(2021, mes, dia));
        agendamento.setHora(hora);


    }
}

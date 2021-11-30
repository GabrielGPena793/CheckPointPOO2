package com.POO;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExibicaoAgendamento implements IExibicaoAgendamento{

    Tatuagem tatuagem = new Tatuagem();
    Agendamento agendamento = new Agendamento();
    Scanner scanner = new Scanner(System.in);
    ServicoAgendamento servicoAgendamento = new ServicoAgendamento();

    @Override
    public void telaAgenda() { // Responsavel por mostrar a tela de agenda
        int escolha = 0;

        while (escolha != 3) {
            System.out.println("---------------------");
            System.out.println("""
                    Menu Agendamento, Digite:\s
                    1 - Fazer Agendamento\s
                    2 - Detalhes do Agendamento\s
                    3 - Sair do agendamento""");
            System.out.println("---------------------");

            escolha = scanner.nextInt();

            if (escolha == 1) {
                this.telaAgendamento(); // chamando a função responsavel por mostar a tela de agendamento
            }

            if (escolha == 2 && agendamento.getData()!= null ){
                this.telaDeatalhesAgendamento(); // chamando a função responsavel por mostar a tela de detalhes do agendamento
            }else if (escolha == 2){
                System.out.println("Você ainda não tem um agendamento marcado");
            }

            if(escolha == 3) {
                System.out.println("Voltando para o menu");
            }

        }
    }

    @Override
    public void telaAgendamento() { // Responsavel por mostrar a tela de agendamento da tatuagem

        //dados da tatuagem
        System.out.println("---------------------");
        System.out.println("""
                Selecione o tamanho da tatuagem:\s
                1 - Pequena\s
                2 - Média\s
                3 - Grande""");
        System.out.println("---------------------");
         int tamanho = scanner.nextInt();

        System.out.println("---------------------");
        System.out.println("""
                Selecione o tipo da tatuagem:\s
                1 - Tribal\s
                2 - Old School \s
                3 - New School\s
                4 - Outro tipo""");
        System.out.println("---------------------");
        int tipo = scanner.nextInt();

        //Dados agenda
        System.out.println("---------------------");
        System.out.println("informe a data do agendamento:");
        System.out.println("Dia:");
        int dia = scanner.nextInt();
        System.out.println("Mês:");
        int mes = scanner.nextInt();
        System.out.println("Hora");
        int hora = scanner.nextInt();
        System.out.println("---------------------");

        servicoAgendamento.agendar(tamanho, tipo, dia, mes, hora, tatuagem, agendamento); // chamando a função responsavel para o agendamento

        System.out.println("Agendamento feito com sucesso!");

    }

    @Override
    public void telaDeatalhesAgendamento() {  // Responsavel por printar todos os dados do agendamento

        double preco = 0;
        if (tatuagem.getTamanho().equals("Grande")){
            preco = tatuagem.getPrecoGrande();
        }
        if (tatuagem.getTamanho().equals("Pequena")){
            preco = tatuagem.getPrecoPequena();
        }
        if (tatuagem.getTamanho().equals("Média")){
            preco = tatuagem.getPrecoMedia();
        }

        System.out.println("---------------------");
        System.out.println("Tatuagem : " + tatuagem.getTamanho() +
                "\nEstilo: " + tatuagem.getTipo() +
                "\nData: " + agendamento.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                "\nHora: " + agendamento.getHora() + " horas"+
                "\nPreço: R$" + preco);
        System.out.println("---------------------");

        int sair = 0;
        while (sair != 1){
            System.out.println("1 - Sair dos detalhes");
            sair = scanner.nextInt();
        }
    }
}

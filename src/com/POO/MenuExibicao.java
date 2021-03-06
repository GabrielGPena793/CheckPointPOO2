package com.POO;

import java.util.Scanner;

public class MenuExibicao implements IMenuExibicao{

    ExibicaoAgendamento exibicaoAgendamento = new ExibicaoAgendamento();
    ExibirPefil exibirPefil = new ExibirPefil();

    public void telaMenu(Usuario user) { // responsavel por mostrar a tela de menu
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        while (escolha != 3) {
            System.out.println("---------------------");
            System.out.println("""
                    App Menu, Digite:\s
                    1 - Agendar\s
                    2 - Perfil\s
                    3 - Deslogar""");
            System.out.println("---------------------");

            escolha = scanner.nextInt();

            if (escolha == 1) {
                exibicaoAgendamento.telaAgenda(); // chamando  a função responsavel por mostrar a tela da agenda
            } else if (escolha == 2) {
                exibirPefil.telaPerfil(user); // chamando  a função responsavel por mostrar a tela de perfil
            } else if(escolha == 3) {
                System.out.println("Deslogado com sucesso!");
            }
        }
    }
}

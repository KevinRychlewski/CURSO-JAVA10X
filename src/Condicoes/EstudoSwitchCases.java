package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        // SwitchCases: Que servem para gerar casos especificos
        // Objetivo: Pediro pro usuario escolher entre os ninjas

        Scanner scanner = new Scanner(System.in);

        // Mostrar opcoes para o usuario
        System.out.println("Escolha um personagm");
        System.out.println("1-Naruto");
        System.out.println("2-Sasuke");
        System.out.println("3-Sakura");

        int opcao = scanner.nextInt();
        System.out.println("voce digitou o numero: " +opcao);

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu o naruto");
                break;
            case 2:
                System.out.println("Você escolheu o sasuke");
                break;
            case 3:
                System.out.println("Você escolher a sakura");
            default:
                System.out.println("Você não digitou uma reposta valida, tente de novo");
        }
        scanner.close();
    }
}

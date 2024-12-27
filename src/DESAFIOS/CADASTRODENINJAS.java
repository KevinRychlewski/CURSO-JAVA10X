package DESAFIOS;

import java.util.Scanner;

public class CADASTRODENINJAS {
    public static void main(String[] args) {
        String[] ninjas = new String[5];
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");


            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    for (int i = 0; i < ninjas.length; i++) {
                        if (ninjas[i] != null) {
                            System.out.println("Array esta cheio, vc nao pode mais cadastrar ninjas");
                            break;
                        }
                        System.out.print("Digite o nome do ninja " + (i + 1) + ": ");
                        ninjas[i] = scanner.nextLine();
                        System.out.println("Ninja cadastrado com sucesso");
                    }
                    break;

                case 2:
                    if (ninjas[0] == null) {
                        System.out.println("Nenhum ninja cadastrado, gostaria de cadastrar algum ninja?");
                    } else {
                        System.out.println("NINJAS CADASTRADOS");
                        for (int i = 0; i < ninjas.length ; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saindo do programa");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}
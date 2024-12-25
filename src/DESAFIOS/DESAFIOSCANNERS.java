package DESAFIOS;

import java.util.Scanner;

public class DESAFIOSCANNERS {
    public static void main(String[] args) {

        Scanner caixaDeTexto = new Scanner(System.in);
        System.out.println("Digite o nome do usuario na linha de baixo");
        String nomeUsuario = caixaDeTexto.nextLine();
        System.out.println("O nome do usuario é: " + nomeUsuario);

        System.out.println("Agora digite a idade do usuario na linha de baixo");
        int idadeUsuario = caixaDeTexto.nextInt();
        System.out.println("A idade do usuario é " + idadeUsuario);

        System.out.println("Boas vindas " +nomeUsuario+ " você tem " +idadeUsuario+ " anos");

        caixaDeTexto.close();
    }
}

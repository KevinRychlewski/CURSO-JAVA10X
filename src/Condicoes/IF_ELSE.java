package Condicoes;

public class IF_ELSE {
    public static void main(String[] args) {

        // Objetivo: Passar o ninja de nivel de acordo com o numero de missoes
        // IF e ELSE - Condicoes
        // ELSE IF

        String nome = "Naruto";
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 20;
        String rank = "";

        // se(condicao) {faca isso}

        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        }else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        }else {
            System.out.println("Rank: Gennim");
        }
    }
}

package DESAFIOS;

public class DESAFIO1 {
    public static void main(String[] args) {
        // Ninja 1
        String nome = "naruto";
        int idade = 14;
        String missao = "matar sasuke";
        String nomeMissao = "matar um uchiha";
        char nivelDeDificuldade = 'B';
        String concluidaOuNao;

        System.out.println("Ninja 1:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nome da missão: " + nomeMissao);
        System.out.println("Nivel de dificuldade: " + nivelDeDificuldade);

        if (idade > 15) {
            concluidaOuNao = "concluida";
            System.out.println(concluidaOuNao);
        } else if (idade < 15 && nivelDeDificuldade == 'C' || nivelDeDificuldade == 'D') {
            concluidaOuNao = "concluida";
            System.out.println("missao " +concluidaOuNao);
        } else {
            concluidaOuNao = "Ninjas abaixo de 15 anos nao podem completar missoes desse nivel";
            System.out.println(concluidaOuNao);
        }

    }
}

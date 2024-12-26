package Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        // Ternarios: são maneiras de reduzir o código
        // variavel - (condicao) ? true : false;

        short numeroDeMissoes = 11;
        String nivel = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missoes" : "Esse ninja tem menos de 10 missoes";
        System.out.println(nivel);

    }
}

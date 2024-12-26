package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        //Lacos de Repeticao: Vao repetir infinitamente ou até um parametro desejavel
        //WHILE = FOR

        // While
        // While (conficao) {tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        while (numeroDeClones <= numeroMaximoDeClones) {
            System.out.println("O naruto fez um clone das sombras");
            numeroDeClones++;
        }

        // FOR

        System.out.println("-------");

        for (int i = 0; i < 40 ; i++) {
            System.out.println("O naruto fez um clone das sombras");
        }

    }
}

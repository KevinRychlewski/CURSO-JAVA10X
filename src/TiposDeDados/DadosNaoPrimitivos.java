package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        // Dados Primitivos não podem conter métodos, já os não primitivos podem
        // Dados não primitivos: String, Array, Class, enum
        // Objetivo: Criar um ninja, e atribuir métodos para ele

        String nome = "Naruto";
        String nomeUpperCase = nome.toUpperCase(); // ToUpperCase vai colocar tudo em CAPSLOCK
        System.out.println("Esse texto está em CAPSLOCK " + nomeUpperCase);


        String aldeia = "Aldeia da Folha";
        String aldeiatoLoweCase = aldeia.toLowerCase(); // toLowerCase vai colocar tudo em caixa baixa
        System.out.println(aldeiatoLoweCase);
    }
}

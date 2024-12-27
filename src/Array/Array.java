package Array;

public class Array {
    public static void main(String[] args) {

        // Arrays sao tipo referencia
        String[] ninjas = new String[5];
        ninjas[0] = "Naruto";
        ninjas[1] = "Sasuke";
        ninjas[2] = "Sakura";
        ninjas[3] = "Kakashi";
        ninjas[4] = "Hinata";

        // Redeclarar o Array
        ninjas = new String[7];
        ninjas[0] = "Hashirama";
        ninjas[1] = "Tobirama";
        ninjas[2] = "Sarutobi";
        ninjas[3] = "Minato";
        ninjas[4] = "Tsunade";
        ninjas[5] = "Kakashi";
        ninjas[6] = "Naruto";


        // For para mostrar todo o Array
        for (int i = 0; i <7 ; i++) {
            System.out.println(ninjas[i]);
        }
        // Array idade
        int[] idade = new int[2];
        System.out.println(idade[0]);
    }
}

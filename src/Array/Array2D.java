package Array;

public class Array2D {
    public static void main(String[] args) {
        String[][] ninjasEAldeias = new String[3][3];

        ninjasEAldeias[0][0] = "Konoha";
        ninjasEAldeias[0][1] = "Naruto";
        ninjasEAldeias[0][2] = "Sasuke";

        ninjasEAldeias[1][0] = "Nevoa";
        ninjasEAldeias[1][1] = "Zabuza";
        ninjasEAldeias[1][2] = "Haku";

        ninjasEAldeias[2][0] = "Deserto";
        ninjasEAldeias[2][1] = "Gaara";
        ninjasEAldeias[2][2] = "Temari";

        for (int i = 0; i <ninjasEAldeias.length ; i++) {
            System.out.println("Aldeia " +ninjasEAldeias[i][0] + " Ninja " + ninjasEAldeias[i][1] + " Segundo ninja " + ninjasEAldeias[i][2]);
        }
    }
}
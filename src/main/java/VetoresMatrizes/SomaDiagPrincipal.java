package VetoresMatrizes;
import java.util.Scanner;
import java.util.Arrays;

public class SomaDiagPrincipal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da matriz quadrada");
        int tamMatriz = scanner.nextInt();

        int LIN = tamMatriz;
        int COL = LIN;

        int matriz[][] = new int[LIN][COL];

        //leitura
        for (int i = 0; i < LIN; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.println("Informe: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        //apresentação
        for (int i = 0; i < LIN; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.print(matriz[i][j]);
            }

        }


    }
}

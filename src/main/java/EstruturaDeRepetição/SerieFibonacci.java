package EstruturaDeRepetição;
import java.util.Scanner;
import java.util.Arrays;

class SerieFibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro e não negativo para ser calculado a função de Fibonacci:");
        int numUser = scanner.nextInt();

        int[] listaFibo = new int[numUser+1];

        for (int i = 0; i <= numUser; i++) {
            if (i == 0 || i == 1) {
                listaFibo[i] = i;
            } else {
                listaFibo[i] = listaFibo[i - 1] + listaFibo[i - 2];
            }
        }

        System.out.println(Arrays.toString(listaFibo));

    }
}
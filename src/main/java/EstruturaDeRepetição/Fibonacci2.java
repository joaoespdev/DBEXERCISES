package EstruturaDeRepetição;
import java.util.Scanner;
import java.util.Arrays;

class Fibonacci2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite um número inteiro e não negativo para ser calculado a função de Fibonacci:");
        System.out.println("OBS: O programa só irá calcular até o número 8");

        int numUser = scanner.nextInt();

        int[] listaFibo = new int[numUser+1];

        for (int i = 0; i <= numUser; i++) {
            if (i == 0 || i == 1) {
                listaFibo[i] = i;
            } else {
                listaFibo[i] = listaFibo[i - 1] + listaFibo[i - 2];
            }
        }

        if (numUser <= 7) {
            System.out.println(Arrays.toString(listaFibo));
        } else {
            System.out.println(Arrays.toString(Arrays.copyOf(listaFibo, 9)));
        }


    }
}
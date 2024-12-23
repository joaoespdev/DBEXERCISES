package VetoresMatrizes;

import java.util.Arrays;
import java.util.Random;

public class VetoresCombinados {
    public static void main(String[] args) {
        int[]a = new int[50];
        int[]b = new int[50];

        randomizar(a, b);
        Arrays.sort(a);
        Arrays.sort(b);

        int[]c = concatenar(a, b);

        Arrays.sort(c);

        System.out.println(Arrays.toString(c));
    }

    private static int[] concatenar(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            c[k++] = a[i];
        }

        //k já não será mais 0, e continuará transferindo os valores de b para c após o a terminar de fazer isso.
        for (int i = 0; i < b.length; i++) {
            c[k++] = b[i];
        }

        return c;
    }

    private static void randomizar(int[] a, int[] b) {

        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = random.nextInt(10);
        }

    }


}

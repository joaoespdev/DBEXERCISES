package EstruturaDeRepetição;
import java.util.Random;
import java.util.Arrays;

public class NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numeros = new int[10];

        //numeros.length para percorrer o array

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }

        // i irá percorrer o índice de 0 a 10, com random.nextInt atribuindo valores
        // de 0 a 100.


        /*Arrays.stream() é um métdo estático da classe de Arrays do Java.
        Ele é usado para converter o array em uma stream, que permite que você
        Realize operações funcionais sobre os dados do array.*/

        int menorValor = Arrays.stream(numeros).min().getAsInt();
        int maiorValor = Arrays.stream(numeros).max().getAsInt();


        System.out.println(Arrays.toString(numeros));
        System.out.println("O menor valor da lista é: " + menorValor);
        System.out.println("O maior valor da lista é: " + maiorValor);

    }
}

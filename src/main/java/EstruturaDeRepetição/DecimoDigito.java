package EstruturaDeRepetição;
import java.util.Scanner;

public class DecimoDigito {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float respostaUsuario;

        do {
            System.out.println("Digite números, em quanto forem diferentes de 10 o programa continuará rodando.");
            respostaUsuario = scanner.nextFloat();
        } while (respostaUsuario != 10);

    }
}

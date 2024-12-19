package ExerciciosBasicos;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma operação dentre as opções a seguir:\n");
        System.out.println("1- Adição +\n");
        System.out.println("2- Subtração -\n");
        System.out.println("3- Multiplicação *\n");
        System.out.println("4- Divisão /\n");
        int escolha = scanner.nextInt();

        if (escolha < 1 || escolha > 4) {
            System.out.println("O número digitado é inválido, confira novamente a lista de operações.");
            return;
        };

        System.out.println("Agora escolha o primeiro número que deseja calcular:");
        double numero1 = scanner.nextDouble();
        System.out.println("O segundo também:");
        double numero2 = scanner.nextDouble();


        switch (escolha) {
            case 1:
                System.out.println("O resultado da conta é " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("O resultado da conta é " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("O resultado da conta é " + (numero1 * numero2));
                break;
            case 4:
                if (numero1 == 0 || numero2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                    return;
                }
                System.out.println("O resultado da conta é " + (numero1 / numero2));
                break;
        }

    }

}

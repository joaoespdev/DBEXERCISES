package VetoresMatrizes;
import java.util.Scanner;

public class Calculadora2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma operação dentre as opções a seguir:\n");
        System.out.println("1- Adição +\n");
        System.out.println("2- Subtração -\n");
        System.out.println("3- Multiplicação *\n");
        System.out.println("4- Divisão /\n");
        System.out.println("5- Potenciação /\n");
        int escolha = scanner.nextInt();

        double numero1 = 0;
        double numero2 = 0;

        if (escolha < 1 || escolha > 5) {
            System.out.println("O número digitado é inválido, confira novamente a lista de operações.");
            return;
        };

        if (escolha >= 1 && escolha <= 4) {
            System.out.println("Agora escolha o primeiro número que deseja calcular:");
             numero1 = scanner.nextDouble();
            System.out.println("O segundo também:");
             numero2 = scanner.nextDouble();
        } else {
            System.out.println("Escolha a base para a conta:");
             numero1 = scanner.nextDouble();
            System.out.println("Agora escolha o expoente:");
             numero2 = scanner.nextDouble();

        }


        switch (escolha) {
            case 1:
                double resultado1 = somar(numero1, numero2);
                System.out.println(resultado1);
                break;
            case 2:
                double resultado2 = subtrair(numero1, numero2);
                System.out.println(resultado2);
                break;
            case 3:
                double resultado3 = multiplicar(numero1, numero2);
                System.out.println(resultado3);
                break;
            case 4:
                if (numero1 == 0 || numero2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                    return;
                }
                double resultado4 = dividir(numero1, numero2);
                System.out.println(resultado4);
                break;
            case 5:
                double resultado5 = elevar(numero1, numero2);
                System.out.println(resultado5);
        }

    }

    //MÉTODOS

    private static double somar(double numero1, double numero2) {
        double resultadoSoma = numero1 + numero2;
        return resultadoSoma;
    }

    private static double subtrair(double numero1, double numero2) {
        double resultadoSub = numero1 - numero2;
        return resultadoSub;
    }

    private static double multiplicar(double numero1, double numero2) {
        double resultadoMulti = numero1 * numero2;
        return resultadoMulti;
    }

    private static double dividir(double numero1, double numero2) {
        double resultadoDivi = numero1 / numero2;
        return resultadoDivi;
    }

    private static double elevar(double numero1, double numero2) {
        double resultadoPotencia = Math.pow(numero1, numero2);
        return resultadoPotencia;
    }

}

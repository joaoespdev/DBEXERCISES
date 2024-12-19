package ExerciciosBasicos;
import java.util.Scanner;
import java.util.Random;

public class Jokenpo {
    public static void main(String[] args) {
    String[] escolhasPossiveis = {"pedra", "papel", "tesoura"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Jokenpo!");
        System.out.println("Escolha entre:\n");
        System.out.println("0 - Pedra; " + " 1 - Papel; " + " 2 - Tesoura");
        int escolhaJogador = scanner.nextInt();

        if (escolhaJogador < 0 || escolhaJogador > 2) {
            System.out.println("Valor inválido, tente novamente.");
            return;
        }

        Random random = new Random();
        int escolhaMaquina = random.nextInt(3);

        System.out.println("Sua escolha: " + escolhasPossiveis[escolhaJogador]);
        System.out.println("Escolha da máquina: " + escolhasPossiveis[escolhaMaquina]);

        if (escolhaJogador == escolhaMaquina) {
            System.out.println("Hmm, parece que houve um empate! Fim de jogo.");
        } else if (escolhaJogador == 0 && escolhaMaquina == 2) {
            System.out.println("Pedra vence tesoura, você venceu!");
            System.out.println("Fim de jogo.");
        } else if (escolhaJogador == 1 && escolhaMaquina == 0) {
            System.out.println("Papel vence pedra, você venceu!");
            System.out.println("Fim de jogo.");
        } else if (escolhaJogador == 2 && escolhaMaquina == 1) {
            System.out.println("Tesoura vence papel, você venceu!");
            System.out.println("Fim de jogo.");
        } else {
            System.out.println("A máquina venceu pois " + escolhasPossiveis[escolhaJogador] + " perde para " + escolhasPossiveis[escolhaMaquina]);
            System.out.println("Fim de jogo.");
        }

}}

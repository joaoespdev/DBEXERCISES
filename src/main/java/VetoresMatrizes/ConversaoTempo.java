package VetoresMatrizes;
import java.util.Scanner;

public class ConversaoTempo {
    public static void main(String[] args) {
        int tempoEmSegundos = lerTempo();
        int horas = calcularHoras(tempoEmSegundos);
        int minutos = calcularMinutos(tempoEmSegundos);
        int segundos = calcularSegundos(tempoEmSegundos);
        escreverResultado(horas, minutos, segundos);
    }

    private static int lerTempo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tempo em segundos: ");
        return scanner.nextInt();
    }

    private static int calcularHoras(int tempoEmSegundos) {
        return tempoEmSegundos / 3600;
    }

    private static int calcularMinutos(int tempoEmSegundos) {
        return (tempoEmSegundos % 3600) / 60;
    }

    private static int calcularSegundos(int tempoEmSegundos) {
        return tempoEmSegundos % 60;
    }

    private static void escreverResultado(int horas, int minutos, int segundos) {
        System.out.printf("%d segundos equivalem a %dh %dmin %dseg.\n", horas * 3600 + minutos * 60 + segundos, horas, minutos, segundos);
    }
}

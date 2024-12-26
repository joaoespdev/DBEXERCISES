package VetoresMatrizes;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {

        //A média do aluno deverá ser igual ou superior a 7. Av's serão as avaliações.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota da av1:");
        double av1 = scanner.nextDouble();

        System.out.println("Digite a nota da av2:");
        double av2 = scanner.nextDouble();

        System.out.println("Agora digite a nota da av3");
        double av3 = scanner.nextDouble();

        double mediaAluno = obterMedia(av1, av2, av3);

        String situacao = obterResultado(mediaAluno);

        System.out.println(mediaAluno);
        System.out.println(situacao);

    }

    private static double obterMedia (double av1, double av2, double av3) {
        double mediaAluno = (av1 + av2 + av3) /3;
        return mediaAluno;
    }

    private static String obterResultado (double resultado) {
        if (resultado < 0 || resultado > 10) {
            return "Não foi possível obter a situação acadêmica do aluno.\n Para mais informações, consulte a secretaria.";
        } else if (resultado < 4) {
            return "O aluno foi reprovado.";
        } else if (resultado <= 6) {
            return "O aluno está em verificação suplementar.";
        } else {
            return "O aluno foi aprovado.";
        }
    }




}

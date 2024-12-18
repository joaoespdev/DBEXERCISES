package ExerciciosBasicos;
import java.util.Scanner;

public class DescontoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Entrada de dados
        System.out.println("Digite o nome do produto:");
        String nomeProduto = scanner.nextLine();

        System.out.println("Digite o preço do produto:");
        double precoProduto = scanner.nextDouble();

        System.out.println("Digite a quantidade desejada:");
        int quantidadeProduto = scanner.nextInt();

        //Calculando desconto
        double valorTotal = precoProduto * quantidadeProduto;

        double desconto = 0;

        if (quantidadeProduto > 50) {
            desconto = 0.25;
        } else if (quantidadeProduto >= 21) {
            desconto = 0.20;
        } else if (quantidadeProduto >= 11) {
            desconto = 0.10;
        }

        //Aplicando percentual de desconto
        double valorComDesconto = valorTotal - (valorTotal * desconto);

        //Saída de dados
        System.out.println("Detalhes da compra:\n");
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Quantidade: " + quantidadeProduto);
        System.out.println("Preço unitário: R$" + precoProduto);
        System.out.printf("Valor total (sem desconto): R$%.2f%n", valorTotal);
        System.out.printf("Valor total (com desconto): R$%.2f%n", valorComDesconto);

        scanner.close();

    }
}

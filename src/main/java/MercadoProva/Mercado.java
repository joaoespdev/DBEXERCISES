package MercadoProva;
import java.util.Scanner;

public class Mercado {
    private final Estoque estoque;
    private final Pedido pedido;

    public Mercado() {
        this.estoque = new Estoque();
        this.estoque.InicializaEstoque();
        this.pedido = new Pedido(this.estoque);
    }
    public static void main(String[] args) {
        Mercado mercado = new Mercado();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n-=-=-= Mercado =-=-=-");
            System.out.println("1. Mostrar Estoque");
            System.out.println("2. Adicionar Produto");
            System.out.println("3. Exibir Pedido");
            System.out.println("4. Finalizar Pedido e Calcular Troco");
            System.out.println("5. Cadastrar Produto");
            System.out.println("6. Limpar carrinho");
            System.out.println("7. Sair");
            System.out.println("\n----------------------");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                //Aqui irei chamar os métdos
                case 1:
                //Sem o "mercado.estoque" ocorre nonstatic field error, porque estou referenciando um código não estático
                //dentro de um métdo estático (main). Também poderia corrigir colocando o switch fora do métdo main.
                    mercado.estoque.ImprimeCatalogoDoEstoque();
                    break;
                case 2:
                    System.out.println("Digite o ID do produto:");
                    int id = scanner.nextInt();
                    System.out.println("Digite a quantidade:");
                    int quantidade = scanner.nextInt();

                    Produto produto = mercado.estoque.EncontrarProdutoPeloId(id);
                    if (produto != null && mercado.pedido.AdicionarItemNaLista(produto, quantidade)) {
                        System.out.println("Produto adicionado ao pedido!");
                    } else {
                        System.out.println("Erro: Produto não encontrado ou quantidade insuficiente.");
                    }
                    break;
                case 3:
                    mercado.pedido.ImprimePedido();
                    break;
                case 4:
                    System.out.println("Valor total: " + mercado.pedido.getValorTotalDoPedido());
                    System.out.println("Digite o valor pago:");
                    double valorPago = scanner.nextDouble();

                    if (valorPago >= mercado.pedido.getValorTotalDoPedido()) {
                        double troco = valorPago - mercado.pedido.getValorTotalDoPedido();
                        System.out.println("Troco: " + troco);
                        mercado.pedido.CalcularNotasDoTroco(troco);
                        mercado.pedido.FinalizarPedido(); // Remover itens do estoque
                    } else {
                        System.out.println("Erro: Valor insuficiente! Nenhum item foi removido do estoque.");
                    }
                    break;
                case 5:
                    try {
                        System.out.println("Digite o ID do novo produto:");
                        int novoID = scanner.nextInt();
                        scanner.nextLine(); // Limpa o buffer após nextInt()

                        System.out.println("Digite o nome do produto novo:");
                        String novoNome = scanner.nextLine();

                        System.out.println("Digite o preço do produto (use ponto ou vírgula como separador decimal):");
                        String precoInput = scanner.nextLine().replace(",", "."); // Substitui vírgula por ponto
                        double novoPreco = Double.parseDouble(precoInput); // Converte para double

                        System.out.println("Agora a quantidade:");
                        int novaQuantidade = scanner.nextInt();

                        Produto novoProduto = new Produto(novoID, novoNome, novoPreco, novaQuantidade);
                        mercado.estoque.CadastraProduto(novoProduto);
                        System.out.println("Produto Cadastrado Com Sucesso!");
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Formato de preço inválido. Use ponto ou vírgula como separador decimal.");
                    } catch (Exception e) {
                        System.out.println("Erro: Entrada inválida. Tente novamente.");
                        scanner.nextLine(); // Limpa o buffer caso algo inválido seja inserido
                    }
                    break;
                case 6:
                    mercado.pedido.LimparCarrinho();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    System.exit(0);
            }

        }

        }

    }

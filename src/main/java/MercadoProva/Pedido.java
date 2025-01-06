package MercadoProva;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    private Estoque estoque;
    private ArrayList<Item> listaDeItens = new ArrayList();
    private double valorTotalDoPedido = 0;
    Scanner scanner = new Scanner(System.in); //Scanners em ReceberNomeDoTeclado(), ReceberQuantidadeDoTeclado()


    public Pedido(Estoque estoque) {
        this.estoque = estoque;
    }

    public void CalcularValorTotal() {
        valorTotalDoPedido = 0;
        for (Item item : listaDeItens) {
            valorTotalDoPedido += item.getQuantidade() * item.getProduto().getPreco();
            //valorTotalDoPedido = valorTotalDoPedido + item.getQuantidade() * item.getProduto().getPreco();
        }
    }

    public void CalcularNotasDoTroco(double troco) {
        int [] notas = {100, 50, 20, 10, 5, 2, 1};
        System.out.println("Troco de: " + troco);
        for (int nota : notas) {
            int quantidadeDeNotas = (int) troco / nota;
            if (quantidadeDeNotas > 0) {
                System.out.println(quantidadeDeNotas + " nota(s) de R$" + nota);
                troco %= nota;
            }
        }
    }

    //Retorna um booleano para indicar se a operação de adicionar item foi bem sucedida ou não.
    //o if irá verificar se há quantidadeEmEstoque suficiente para adicionar a quantidade que o usuário quer ao carrinho.
    public boolean AdicionarItemNaLista(Produto produto, int quantidade) {
        if (estoque.TemEstoqueOuNao(produto, quantidade)) {
            listaDeItens.add(new Item(produto, quantidade));
            CalcularValorTotal();
            return true;
        } else {
            return false; // Sem estoque suficiente
        }
    }

    public void FinalizarPedido() {
        for (Item item : listaDeItens) {
            estoque.DarBaixaEmEstoque(item.getProduto(), item.getQuantidade());
        }
        LimparCarrinho();
    }

    public void ImprimePedido() {
        for(Item item : listaDeItens) {
            System.out.println("Produto: " + item.getProduto().getNome() + ", Quantidade: " + item.getQuantidade() + ", Valor: " + item.getValorDoItem());
        }
        System.out.println("Total: " + valorTotalDoPedido);
    }

    public void ImprimeValorTotal() {

    }

    public String RecebeNomeDoTeclado() {
        System.out.println("Digite o nome do produto:");
        return scanner.nextLine();
    }

    public int RecebeQuantidadeDoTeclado() {
        System.out.println("Digite a quantidade do produto:");
        return scanner.nextInt();
    }

    public void LimparCarrinho() {
        listaDeItens.clear();
        valorTotalDoPedido = 0;
        System.out.println("Carrinho limpo com sucesso!");
    }

    public ArrayList<Item> getListaDeItens() {
        return listaDeItens;
    }

    public double getValorTotalDoPedido() {
        return valorTotalDoPedido;
    }

    public void setListaDeItens() {
        this.listaDeItens = listaDeItens;
    }

    public void setValorTotalDoPedido() {
        this.valorTotalDoPedido = valorTotalDoPedido;
    }
}

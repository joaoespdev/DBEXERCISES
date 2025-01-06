package MercadoProva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {
    int id = 1;
    private final List<Produto> listaDeProdutos = new ArrayList<>();

    //Estoque estoque = new Estoque();

    Scanner scanner = new Scanner(System.in);

    public void InicializaEstoque() {
        listaDeProdutos.add(new Produto(1, "Arroz", 8.99, 30));
        listaDeProdutos.add(new Produto(2, "Feijão", 5.50, 20));
        listaDeProdutos.add(new Produto(3, "Filé de frango kg", 29.00, 15));
    }

    public Produto EncontrarProdutoPeloId(int id) {
        for (Produto produto : listaDeProdutos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public boolean CadastraProduto(Produto produto) {
        for (Produto p : listaDeProdutos) {
            if (p.getId() == produto.getId() || p.getNome().equals(produto.getNome())) {
                System.out.println("Erro: Produto já cadastrado no estoque!");
                return false; // Retorna falso se encontrar um produto duplicado
            }
        }
        // Adiciona o produto caso não tenha encontrado duplicatas
        listaDeProdutos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
        return true; // Retorna verdadeiro após adicionar o produto
    }

    public void ImprimeCatalogoDoEstoque() {

        for (Produto produto : listaDeProdutos) {
            System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome() + ", Preço: " + produto.getPreco() + ", Estoque: " + produto.getQuantidadeEmEstoque());
        }


    }

    public boolean DarBaixaEmEstoque(Produto produto, int quantidadeParaDarBaixa) {
        if (TemEstoqueOuNao(produto, quantidadeParaDarBaixa)) {
            produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - quantidadeParaDarBaixa);
            return true;
        } else {
            System.out.println("Erro: Estoque insuficiente.");
            return false;
        }
    }

    /*public int getPosicaoDoProdutoNaLista(Produto produto) {

    }*/

    public boolean TemEstoqueOuNao(Produto produto, int quantidadeParaDarBaixa) {
        return produto.getQuantidadeEmEstoque() >= quantidadeParaDarBaixa;
    }


}

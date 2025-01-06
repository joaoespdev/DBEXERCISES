package MercadoProva;

public class Item {
    private Produto produto;
    private int quantidade;
    private double valorDoItem;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorDoItem = produto.getPreco() * quantidade;
    }

    public void defineValorTotal() {

    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorDoItem() {
        return valorDoItem;
    }

    //Digo que a var tem o valor dela mesma, para poder acessa-la mesmo estando privada.
    public void setProduto() {
        this.produto = produto;
    }

    public void setQuantidade() {
        this.quantidade = quantidade;
    }

    public void setValorDoItem() {
        this.valorDoItem = valorDoItem;
    }


}

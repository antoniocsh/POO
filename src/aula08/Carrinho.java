package aula08;

public class Carrinho implements Compra {
    private Produto[] produtos;
    private int quantidade;
    private double total;

    public Carrinho() {
        produtos = new Produto[10];
        quantidade = 0;
        total = 0;
    }

    @Override
    public void adicionarProduto(Produto produto, int quantidade) {
        produto.adicionarQuantidade(quantidade);
        this.produtos[this.quantidade] = produto;
        this.quantidade++;
    }

    @Override
    public void listarProdutos() {
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Produto: " + produtos[i].getNome());
            System.out.println("Preço: " + produtos[i].getPreco());
            System.out.println("Quantidade: " + produtos[i].getQuantidade());
            System.out.println("Total: " + produtos[i].getPreco() * produtos[i].getQuantidade());
            if (produtos[i] instanceof Desconto){
            System.out.println("Desconto: " + produtos[i].getDesconto());
            System.out.println("Total com desconto: " + ((produtos[i].getPreco() * produtos[i].getQuantidade()) - produtos[i].getDesconto()));
        }
        }
    }

    @Override
    public double calcularTotal() {
        for (int i = 0; i < quantidade; i++) {
            if (produtos[i] instanceof Desconto){
                total += ((produtos[i].getPreco() * produtos[i].getQuantidade()) - produtos[i].getDesconto());
            }
            else{
            total += produtos[i].getPreco() * produtos[i].getQuantidade();}
        }
        return total;
    }


    
}

package aula08;

public interface Produto {
    String getNome();
    double getPreco();
    int getQuantidade();
    double getDesconto();
    void adicionarQuantidade(int quantidade);
    void removerQuantidade(int quantidade);
    }

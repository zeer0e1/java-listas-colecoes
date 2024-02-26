package Desafios.Classes;

public class ProdutoPerecivel extends Produto {
    String dataValidade;
    public ProdutoPerecivel(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

}

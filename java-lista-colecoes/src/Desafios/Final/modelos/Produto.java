package Desafios.Final.modelos;

public class Produto {
    private String nome;
    private double valor;
    public Produto(String name, double valor){
        this.nome = name;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return getNome() + "- valor: " + getValor();
    }
}

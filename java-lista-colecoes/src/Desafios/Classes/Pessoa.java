package Desafios.Classes;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    private String text = """
            Nome: %s
            Idade: %d
            """;

    @Override
    public String toString() {
        return String.format(text,getNome(),getIdade());
    }
}

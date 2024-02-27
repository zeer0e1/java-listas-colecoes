package Desafios.Classes;

public class Titulo implements Comparable<Titulo>{
    private String nome;

    public  Titulo(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return outroTitulo.getNome().compareTo(this.getNome());
    }
}

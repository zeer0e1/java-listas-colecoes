package br.com.alura.screenmatch.modelos;

public class Titulo {
     private String nome;
    private int anoLancamento;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + getNome());
        System.out.println("Ano de lançamento: "+ anoLancamento);
    }

   public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes ++;
    }

   public double pegaMedia(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public String getNome(){
        return  this.nome;
    }
    public  void setNome(String nome){
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getAnoLancamento(){
        return  this.anoLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
    }

    public boolean getIncluidoNoPlano(){
        return true;
    }

    public  int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}

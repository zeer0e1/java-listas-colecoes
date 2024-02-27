package Desafios.Solucao;

import Desafios.Classes.Pessoa;
import Desafios.Classes.Produto;
import Desafios.Classes.ProdutoPerecivel;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        var p1 = new Pessoa();
        var p2 = new Pessoa();
        var p3 = new Pessoa();

        p1.setNome("Lucas");
        p1.setIdade(28);

        p2.setNome("Rau");
        p2.setIdade(23);

        p3.setNome("Sky");
        p3.setIdade(3);

        System.out.println(p1);


        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        System.out.println("Lista de pessoas: ");
        for (Pessoa pessoa: pessoas){
            System.out.println(pessoa);
        }
        System.out.println("-------------------------");
        Produto pro1 = new Produto("Mouse",3.40);
        Produto pro2 = new Produto("Teclado",30.00);
        Produto pro3 = new Produto("Monitor",500.00);


        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(pro1);
        produtos.add(pro2);
        produtos.add(pro3);

        System.out.println("Tamanho da lista " + produtos.size());
        System.out.println("Primeiro produto da lista: " + produtos.get(0).getNome());

        for(Produto produto : produtos){
            System.out.println(produto);
        }
        System.out.println("--------");
        ProdutoPerecivel prod1 = new ProdutoPerecivel("Arroz",39.00,"2023");
        System.out.println(prod1);

        ArrayList<String> strings = new ArrayList<>();
        String nome1 = "Lucas";
        String nome2 = "Rauana";
        String nome3 = "Sky";

        strings.add(nome1);
        strings.add(nome2);
        strings.add(nome3);

        for (String string: strings){
            System.out.println(string);
        }


    }


}

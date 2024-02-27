package Desafios.Solucao;

import Desafios.Classes.*;

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

        Cachorro cachorro = new Cachorro();
        Animal animal = (Animal) cachorro;

        Produto2 pd1 = new Produto2("Feijão",28.0);
        Produto2 pd2 = new Produto2("Macarrão",23.0);
        Produto2 pd3 = new Produto2("Sal",14.0);

        ArrayList<Produto2> listaCompras = new ArrayList<>();

        listaCompras.add(pd1);
        listaCompras.add(pd2);
        listaCompras.add(pd3);

        double soma = 0;

        for (Produto2 produto:listaCompras) {
            soma += produto.getPreco();
        }

        double media = soma / listaCompras.size();
        System.out.printf("A media dos produtos é: %.2f",media);
        System.out.println();
        System.out.println("---------");

        Circulo c1 = new Circulo();

        c1.setArea(30);
        Quadrado q1 =new Quadrado(5);

        ArrayList<Forma> lis1 = new ArrayList<>();
        lis1.add(c1);
        lis1.add(q1);

        for(Forma item: lis1){
            System.out.printf("%.2f%n",item.calcularArea());
        }

        System.out.println("------------");
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        ContaBancaria cont1 = new ContaBancaria(1234,100);
        ContaBancaria cont2 = new ContaBancaria(456,500);
        ContaBancaria cont3 = new ContaBancaria(7899,300);

        contas.add(cont1);
        contas.add(cont2);
        contas.add(cont3);

        ContaBancaria thanAccountValue = contas.get(0);

        for (ContaBancaria account: contas){
            if(account.getSalt() > thanAccountValue.getSalt()){
                thanAccountValue = account;
            }
        }

        System.out.println(thanAccountValue.getNumberAccount());



    }


}

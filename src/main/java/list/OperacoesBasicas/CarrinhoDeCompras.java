package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaDeCompras;

    public CarrinhoDeCompras() {
        this.listaDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!listaDeCompras.isEmpty()){
            for (Item i : listaDeCompras){
                if (i.getNome().equals(nome)){
                    itensParaRemover.add(i);
                }
            }
            listaDeCompras.removeAll(itensParaRemover);
        }
        else{System.out.println("Não há itens na lista");}
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        for (Item i2 : listaDeCompras){
            valorTotal *= i2.getPreco()*i2.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(listaDeCompras);
    }
}

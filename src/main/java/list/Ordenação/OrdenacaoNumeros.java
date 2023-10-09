package main.java.list.Ordenação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    private OrdenacaoNumeros(){
        this.numeros = new ArrayList<>();
    }

    private void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

     private List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendentes = new ArrayList<>(this.numeros);
        if (!numeros.isEmpty()){
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        }else{throw new RuntimeException("A lista está vazia.");}
     }

     private List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendentes = new ArrayList<>(this.numeros);
        if (!numeros.isEmpty()){
            numerosDescendentes.sort(Collections.reverseOrder());
            return numerosDescendentes;
        }
        else {throw new RuntimeException("A lista está vazia");}
     }

     private void exibirNumeros(){
        System.out.println(numeros);
     }
     public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
    
        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);
    
        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();
    
        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());
    
        // Exibindo a lista
        numeros.exibirNumeros();
    
        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());
    
        // Exibindo a lista
        numeros.exibirNumeros();
      }
    
}

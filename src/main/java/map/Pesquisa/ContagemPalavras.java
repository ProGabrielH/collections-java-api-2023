package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    Map<String, Integer> contagemMap;

    public ContagemPalavras() {
        this.contagemMap = new HashMap<>();
    }

    private void adicionarPalavra(String palavra, Integer contagem){
        contagemMap.put(palavra, contagem);
    }

    private void removerPalavra(String palavra){
        contagemMap.remove(palavra);
    }

    private int tamanhoContagem(){
        return contagemMap.size();
    }

    private Map<String, Integer> exibirContagemPalavras(){
        if (!contagemMap.isEmpty()){
            return contagemMap;
        }else{throw new RuntimeException("Lista vazia");}
    }
    private void encontrarPalavraMaisFrequente(){
        Integer maiorContagem = Integer.MIN_VALUE;
        String palavrFrequente = null;
        if (!contagemMap.isEmpty()){
            for (Map.Entry<String, Integer> i : contagemMap.entrySet()){
                if (i.getValue() > maiorContagem){
                    maiorContagem = i.getValue();
                    palavrFrequente = i.getKey();}
            }System.out.println("A palavra mais frequente é: " + palavrFrequente + " Com: " + maiorContagem);
        }else{System.out.println("Lista vazia");}
    }
    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();
    
        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);
    
        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.tamanhoContagem() + " palavras.");
    
        // Encontra e exibe a linguagem mais frequente
        contagemLinguagens.encontrarPalavraMaisFrequente();

        // Remover palavra
        contagemLinguagens.removerPalavra("JavaScript");
        System.out.println(contagemLinguagens.exibirContagemPalavras());;
      }
}

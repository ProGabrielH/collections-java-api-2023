package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Alunos> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    private void adicionarAluno(String nome, Long matricula, double media){
        alunosSet.add(new Alunos(nome, matricula, media));
    }
    
    private void removerAluno(long matricula){
        Set<Alunos> alunosRemover = new HashSet<>();
        if (!alunosSet.isEmpty()){
            for (Alunos a : alunosSet){
                if (a.getMatricula() == matricula){alunosRemover.add(a);}
            }if (alunosRemover.isEmpty()){System.out.println("Matrícula não encontrada");}
            else {alunosSet.removeAll(alunosRemover);}
        }else{System.out.println("A lista está vazia");}
    }

    private void exibirAlunosPorNome(){
        Set<Alunos> alunosPorNome = new TreeSet<>(alunosSet);
        if (!alunosSet.isEmpty()){System.out.println(alunosPorNome);}
        else {System.out.println("A lista está vazia");}
    }

    private void exibirAlunosPorNota(){
        Set<Alunos> alunosPorNota = new TreeSet<>(new ComparatorNota());
        if (!alunosSet.isEmpty()) {
            alunosPorNota.addAll(alunosSet);
            System.out.println(alunosPorNota);
        }else {System.out.println("A lista está vazia");}
    }

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
    
        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);
    
        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunosSet);
    
        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAluno(000L);
        gerenciadorAlunos.removerAluno(123457L);
        System.out.println(gerenciadorAlunos.alunosSet);
    
        // Exibindo alunos ordenados por nome
        gerenciadorAlunos.exibirAlunosPorNome();
    
        // Exibindo alunos ordenados por nota
        gerenciadorAlunos.exibirAlunosPorNota();
      }
}
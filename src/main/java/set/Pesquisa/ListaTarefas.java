package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefas> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new HashSet<>();
    }

    private void adicionarTarefa(String descricao){
        this.listaTarefas.add(new Tarefas(descricao));
    }
    
    private void removerTarefa(String descricao){
        Set<Tarefas> tarefasRemover = new HashSet<>();
        if (!listaTarefas.isEmpty()){
            for (Tarefas r : listaTarefas){
                if (r.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasRemover.add(r);
                }
            }listaTarefas.removeAll(tarefasRemover);
        }else{System.out.println("A lista está vazia");}
        if (listaTarefas.isEmpty()){System.out.println("Tarefa não existe na lista");}
    }

    private void exibirTarefas(){System.out.println(listaTarefas);}

    private int contarTarefas(){return listaTarefas.size();}

    private Set<Tarefas> obterTarefasConcluidas(){
        Set<Tarefas> tarefasConcluidas = new HashSet<>();
        if(!listaTarefas.isEmpty()){
            for (Tarefas tc : listaTarefas){
                if (tc.isConcluida()){tarefasConcluidas.add(tc);}
            }if (!tarefasConcluidas.isEmpty()){return tarefasConcluidas;}
            else{throw new RuntimeException("Nenhuma tarefa foi concluída");}
        }else{throw new RuntimeException("A lista está vazia");}
    }

    private Set<Tarefas> obterTarefasPendentes(){
        Set<Tarefas> tarefasPendentes = new HashSet<>();
        if (!listaTarefas.isEmpty()){
            for(Tarefas tp : listaTarefas){
                if (!tp.isConcluida()){tarefasPendentes.add(tp);}
            }if (!tarefasPendentes.isEmpty()){return tarefasPendentes;}
            else {throw new RuntimeException("Não há tarefas pendentes");}
        }else {throw new RuntimeException("A lista está vazia");}
    }

    private void marcarTarefaConcluida(String descricao){
        if (!listaTarefas.isEmpty()){
            for (Tarefas mc : listaTarefas){
                if (mc.getDescricao().equalsIgnoreCase(descricao)){
                    mc.setConcluida(true);
                }
            }
        }else {System.out.println("A lista está vazia");}
    }

    private void marcarTarefaPendente(String descricao){
        if (!listaTarefas.isEmpty()){
            for (Tarefas mp : listaTarefas){
                if (mp.getDescricao().equalsIgnoreCase(descricao)){
                    mp.setConcluida(false);
                }
            }
        }else {System.out.println("A lista está vazia");}
    }

    private void limparListaTarefas(){
        listaTarefas.clear();
    }
    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();
    
        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");
    
        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();
    
        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();
    
        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());
    
        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());
    
        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");
    
        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());;
    
        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();
    
        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
      }
}

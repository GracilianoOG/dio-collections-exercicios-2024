package collections.set.pesquisa.lista_tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        if(this.tarefas.isEmpty()) {
            throw new RuntimeException("Não é possível remover tarefa de lista vazia!");
        }

        for(Tarefa tarefa : tarefas) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefas.remove(tarefa);
                break;
            }
        }
    }

    public void exibirTarefas() {
        System.out.println(this.tarefas);
    }

    public int contarTarefas() {
        return this.tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for(Tarefa tarefa : tarefas) {
            if(tarefa.isFoiConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for(Tarefa tarefa : tarefas) {
            if(!tarefa.isFoiConcluida()) {
                tarefasPendentes.add(tarefa);
            }
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for(Tarefa tarefa : tarefas) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setFoiConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for(Tarefa tarefa : tarefas) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setFoiConcluida(false);
                break;
            }
        }
    }

    public void limparListaTarefas() {
        this.tarefas.clear();
    }
}

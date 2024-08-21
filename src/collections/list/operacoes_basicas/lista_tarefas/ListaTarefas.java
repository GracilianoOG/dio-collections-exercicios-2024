package collections.list.operacoes_basicas.lista_tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        for(Tarefa tarefa : tarefas) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                this.tarefas.remove(tarefa);
                break;
            }
        }
    }

    public void removerTarefaRepetida(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for(Tarefa tarefa : tarefas) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }

        tarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return this.tarefas.size();
    }

    public List<String> obterDescricoesTarefas() {
        List<String> descricoes = new ArrayList<>();

        for(Tarefa tarefa : tarefas) {
            descricoes.add(tarefa.getDescricao());
        }

        return descricoes;
    }
}

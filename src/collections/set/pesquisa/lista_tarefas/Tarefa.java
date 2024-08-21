package collections.set.pesquisa.lista_tarefas;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean foiConcluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.foiConcluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setFoiConcluida(boolean foiConcluida) {
        this.foiConcluida = foiConcluida;
    }

    public boolean isFoiConcluida() {
        return foiConcluida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDescricao());
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", foiConcluida=" + foiConcluida +
                '}';
    }
}

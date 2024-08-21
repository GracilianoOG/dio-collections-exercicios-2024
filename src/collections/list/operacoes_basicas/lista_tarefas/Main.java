package collections.list.operacoes_basicas.lista_tarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adiciona itens
        listaTarefas.adicionarTarefa("Limpar a casa");
        listaTarefas.adicionarTarefa("Alimentar o gato");
        listaTarefas.adicionarTarefa("Comprar verduras");

        System.out.println(listaTarefas.obterDescricoesTarefas());

        // Imprime o tamanho
        System.out.println(listaTarefas.obterNumeroTotalTarefas());

        // Deleta item
        listaTarefas.removerTarefa("Comprar verduras");

        System.out.println(listaTarefas.obterDescricoesTarefas());

        // Deleta itens
        listaTarefas.adicionarTarefa("Comprar verduras");
        listaTarefas.adicionarTarefa("Comprar verduras");
        listaTarefas.adicionarTarefa("Comprar verduras");

        System.out.println(listaTarefas.obterDescricoesTarefas());

        listaTarefas.removerTarefaRepetida("Comprar verduras");

        System.out.println(listaTarefas.obterDescricoesTarefas());
    }
}

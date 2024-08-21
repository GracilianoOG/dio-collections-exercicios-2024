package collections.set.pesquisa.lista_tarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();

        // Lista vazia
        tarefas.exibirTarefas();
        System.out.println("Total tarefas: " + tarefas.contarTarefas());
        // -> Exceção: tarefas.removerTarefa("CRASHE IMEDIATAMENTE!!!");

        // Adiciona tarefas (com repetição)
        tarefas.adicionarTarefa("Lavar a louça");
        tarefas.adicionarTarefa("Lavar o carro");
        tarefas.adicionarTarefa("Comprar macarrão");
        tarefas.adicionarTarefa("Alugar casa na praia");
        tarefas.adicionarTarefa("Alugar casa na praia");

        tarefas.exibirTarefas();
        System.out.println("Total tarefas: " + tarefas.contarTarefas());

        // Remover tarefa
        tarefas.removerTarefa("Lavar o carro");

        tarefas.exibirTarefas();
        System.out.println("Total tarefas: " + tarefas.contarTarefas());

        // Marcar tarefas concluidas
        tarefas.marcarTarefaConcluida("Lavar a louça");
        tarefas.marcarTarefaConcluida("Alugar casa na praia");

        tarefas.exibirTarefas();

        // Marcar tarefa pendente
        tarefas.marcarTarefaPendente("Alugar casa na praia");

        tarefas.exibirTarefas();

        // Obter tarefas concluidas
        System.out.println("Tarefas concluídas: ");
        System.out.println(tarefas.obterTarefasConcluidas());

        // Obter tarefas pendentes
        System.out.println("Tarefas pendentes: ");
        System.out.println(tarefas.obterTarefasPendentes());

        // Limpar lista de tarefas
        tarefas.limparListaTarefas();

        tarefas.exibirTarefas();
    }
}

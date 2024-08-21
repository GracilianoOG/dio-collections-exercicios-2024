package collections.set.ordenacao.lista_alunos;

public class Main {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adiciona alunos (com repetição)
        gerenciadorAlunos.adicionarAluno("Abner", 4L, 9.5);
        gerenciadorAlunos.adicionarAluno("João", 1L, 8.5);
        gerenciadorAlunos.adicionarAluno("Paulo", 2L, 7d);
        gerenciadorAlunos.adicionarAluno("Maria", 3L, 10d);
        gerenciadorAlunos.adicionarAluno("Mário", 3L, 6.5);

        gerenciadorAlunos.exibirAlunos();

        // Orderna por nome
        System.out.println("Exibe por nome: ");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        // Ordena por nota
        System.out.println("Exibe por nota");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

        // Remove aluno
        gerenciadorAlunos.removerAluno(2L);

        gerenciadorAlunos.exibirAlunos();
    }
}

package collections.set.ordenacao.lista_alunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota) {
        this.alunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        if(this.alunos.isEmpty()) {
            throw new RuntimeException("Não é possível remover aluno de conjunto vazio!");
        }

        for(Aluno aluno : alunos) {
            if(aluno.getMatricula() == matricula) {
                alunos.remove(aluno);
                break;
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        return new TreeSet<>(alunos);
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunos);
        return alunosPorNota;
    }

    public void exibirAlunos() {
        System.out.println(this.alunos);
    }
}

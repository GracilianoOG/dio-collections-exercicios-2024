package collections.set.pesquisa.agenda_contatos;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numero;

    public Contato(String nome, int contato) {
        this.nome = nome;
        this.numero = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNome());
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", contato=" + numero +
                '}';
    }
}

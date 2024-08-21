package collections.set.operacoes_basicas.palavras_unicas;

public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        // Adiciona palavras (incluíndo repetidas)
        palavrasUnicas.adicionarPalavra("Morango");
        palavrasUnicas.adicionarPalavra("Morango");
        palavrasUnicas.adicionarPalavra("Morango");
        palavrasUnicas.adicionarPalavra("Uva");
        palavrasUnicas.adicionarPalavra("Uva");
        palavrasUnicas.adicionarPalavra("Banana");
        palavrasUnicas.adicionarPalavra("Banana");

        palavrasUnicas.exibirPalavrasUnicas();

        // Verifica se há a palavra "Banana"
        System.out.println("Há a palavra banana? -> " + palavrasUnicas.verificarPalavra("Banana"));

        // Remove uma palavra
        palavrasUnicas.removerPalavra("Banana");

        palavrasUnicas.exibirPalavrasUnicas();

        // Verifica se há a palavra "Banana"
        System.out.println("Há a palavra banana? -> " + palavrasUnicas.verificarPalavra("Banana"));
    }
}

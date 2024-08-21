package collections.set.operacoes_basicas.palavras_unicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        this.palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        for(String palavraUnica : palavrasUnicas) {
            if(palavraUnica.equalsIgnoreCase(palavra)) {
                palavrasUnicas.remove(palavra);
                break;
            }
        }
    }

    public boolean verificarPalavra(String palavra) {
        return this.palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        System.out.println(this.palavrasUnicas);
    }
}

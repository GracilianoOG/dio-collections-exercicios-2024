package collections.set.operacoes_basicas.conjunto_convidados;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        System.out.println("Quantidade de convidados: " + convidados.contarConvidados());

        convidados.adicionarConvidado("C1", 1234);
        convidados.adicionarConvidado("C2", 1235);
        convidados.adicionarConvidado("C3", 1235);
        convidados.adicionarConvidado("C4", 1236);

        System.out.println("Quantidade de convidados: " + convidados.contarConvidados());

        convidados.removerConvidadoPorCodigoConvite(1234);

        System.out.println("Quantidade de convidados: " + convidados.contarConvidados());

        convidados.exibirConvidados();
    }
}

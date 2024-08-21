package collections.set.pesquisa.agenda_contatos;

public class Main {
    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();

        contatos.exibirContatos();

        // Adicionar contatos
        contatos.adicionarContato("Bob", 12341234);
        contatos.adicionarContato("Bob", 43214321);
        contatos.adicionarContato("Bob Marley", 11111111);
        contatos.adicionarContato("Bob Burger", 22222222);
        contatos.adicionarContato("Michael Jackson", 33333333);

        contatos.exibirContatos();

        // Pesquisa de contatos
        System.out.println(contatos.pesquisarPorNome("Bob"));

        // Atualizar contato
        System.out.println("Contato atualizado: " + contatos.atualizarNumeroContato("Bob Burger", 44444444));

        contatos.exibirContatos();
    }
}

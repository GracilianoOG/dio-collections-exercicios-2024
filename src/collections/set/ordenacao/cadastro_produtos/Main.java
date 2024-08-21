package collections.set.ordenacao.cadastro_produtos;

public class Main {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        // Adiciona produtos
        cadastroProdutos.adicionarProduto(1L, "produto 5", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "produto 0", 20d, 10);
        cadastroProdutos.adicionarProduto(1L, "produto 3", 10d, 2);
        cadastroProdutos.adicionarProduto(9L, "produto 9", 2d, 2);

        // Exibe produtos: todos, por nome e por preço
        cadastroProdutos.exibirProdutos();
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}

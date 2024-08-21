package collections.list.operacoes_basicas.lista_de_compras;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoCompras = new CarrinhoDeCompras();

        // Adição de itens
        carrinhoCompras.adicionarItem("Teclado", 29.90, 3);
        carrinhoCompras.adicionarItem("Mouse", 19.90, 2);
        carrinhoCompras.adicionarItem("Caixa de som", 49.90, 1);

        carrinhoCompras.exibirItens();

        // Exclusão de itens
        carrinhoCompras.removerItem("teclado");

        carrinhoCompras.exibirItens();

        // Calcular valor total
        System.out.println("Valor total: R$"
                + String.format("%.2f", carrinhoCompras.calcularValorTotal())
        );
    }
}

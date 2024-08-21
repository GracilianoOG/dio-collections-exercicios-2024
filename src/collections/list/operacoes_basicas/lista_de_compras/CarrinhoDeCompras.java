package collections.list.operacoes_basicas.lista_de_compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> listaDeRemocao = new ArrayList<>();

        for(Item item : listaItens) {
            if(item.getNome().equalsIgnoreCase(nome)) {
                listaDeRemocao.add(item);
            }
        }

        listaItens.removeAll(listaDeRemocao);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;

        for(Item item : listaItens) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }

        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(listaItens);
    }
}

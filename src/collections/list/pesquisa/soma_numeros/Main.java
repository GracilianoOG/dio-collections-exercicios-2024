package collections.list.pesquisa.soma_numeros;

public class Main {
    public static void main(String[] args) {
        SomaNumeros listaNumeros = new SomaNumeros();

        listaNumeros.adicionarNumero(1);
        listaNumeros.adicionarNumero(2);
        listaNumeros.adicionarNumero(3);
        listaNumeros.adicionarNumero(4);
        listaNumeros.adicionarNumero(5);
        listaNumeros.adicionarNumero(-1);

        listaNumeros.exibirNumeros();

        System.out.println("Maior número: " + listaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + listaNumeros.encontrarMenorNumero());
        System.out.println("Soma total..: " + listaNumeros.calcularSoma());
    }
}

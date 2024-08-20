package collections.list.soma_numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;

        if(!this.numeros.isEmpty()) {
            for(int numero : numeros) {
                soma += numero;
            }
        }

        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = this.numeros.get(0);

        if(!this.numeros.isEmpty()) {
            for(int numero : numeros) {
                if(numero > maiorNumero) {
                    maiorNumero = numero;
                }
            }
        }

        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = this.numeros.get(0);

        if(!this.numeros.isEmpty()) {
            for(int numero : numeros) {
                if(numero < menorNumero) {
                    menorNumero = numero;
                }
            }
        }

        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.println(this.numeros);
    }
}

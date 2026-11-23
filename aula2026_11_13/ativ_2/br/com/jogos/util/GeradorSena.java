package br.com.jogos.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GeradorSena {
    private static final int QUANTIDADE_NUMEROS = 6;
    private static final int MAIOR_NUMERO = 60;

    private Random random = new Random();

    public ArrayList<Integer> gerarNumeros() {
        ArrayList<Integer> numeros = new ArrayList<>();

        while (numeros.size() < QUANTIDADE_NUMEROS) {
            int numero = random.nextInt(MAIOR_NUMERO) + 1;
            if (!numeros.contains(numero)) {
                numeros.add(numero);
            }
        }

        Collections.sort(numeros);
        return numeros;
    }
}

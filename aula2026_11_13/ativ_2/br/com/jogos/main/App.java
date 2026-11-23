/*
 * Exercício 2
 *
 * Crie um programa em Java que simule um gerador de números para a Mega-Sena. O
 * programa deve seguir rigorosamente a organização de pacotes e uso de bibliotecas
 * descrita abaixo:
 *
 * Organização de Pacotes:
 * - Crie uma classe chamada GeradorSena dentro do pacote br.com.jogos.util.
 * - Crie uma classe chamada App (onde ficará o main) dentro do pacote
 *   br.com.jogos.main.
 *
 * Uso de Bibliotecas (Classe GeradorSena):
 * - Utilize a classe java.util.Random para gerar números aleatórios.
 * - Utilize a classe java.util.ArrayList (ou HashSet) para armazenar os números.
 * - Utilize a classe java.util.Collections para ordenar os números em ordem
 *   crescente.
 *
 * Regras de Negócio:
 * - O método de geração deve retornar uma lista com 6 números únicos (sem
 *   repetição) entre 1 e 60.
 * - A lista deve ser ordenada antes de ser exibida.
 *
 * Execução (Classe App):
 * - Importe a classe GeradorSena corretamente.
 * - Chame o método, receba a lista e exiba os números no console no formato:
 *   [05, 12, 33, 45, 48, 59].
 */

package br.com.jogos.main;

import br.com.jogos.util.GeradorSena;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        GeradorSena gerador = new GeradorSena();
        ArrayList<Integer> numeros = gerador.gerarNumeros();

        StringBuilder resultado = new StringBuilder("[");
        for (int i = 0; i < numeros.size(); i++) {
            if (i > 0) {
                resultado.append(", ");
            }
            resultado.append(String.format("%02d", numeros.get(i)));
        }
        resultado.append("]");

        System.out.println("--Gerador de Números da Mega-Sena--");
        System.out.println(resultado);
    }
}

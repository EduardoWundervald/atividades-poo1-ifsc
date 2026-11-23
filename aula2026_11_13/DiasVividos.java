/*
 * Exercício 3
 *
 * Desenvolva um pequeno utilitário que calcule quantos dias uma pessoa já viveu.
 *
 * Bibliotecas Obrigatórias:
 * - Utilizar a classe java.time.LocalDate para representar as datas.
 * - Utilizar a classe java.time.temporal.ChronoUnit para realizar o cálculo
 *   matemático entre as datas.
 * - Utilizar a classe java.util.Scanner para ler a data do usuário.
 *
 * Requisitos:
 * - O programa deve solicitar a data de nascimento do usuário (no formato ISO
 *   AAAA-MM-DD para facilitar a leitura, ex: 1995-05-20).
 * - O programa deve capturar a data atual do sistema automaticamente (hoje).
 * - O programa deve calcular a diferença em dias entre a data de nascimento e a
 *   data atual.
 *
 * Saída:
 * - Exiba: "Você nasceu em [data] e já viveu [X] dias até hoje."
 */

package aula2026_11_13;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DiasVividos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate hoje = LocalDate.now();
        LocalDate dataNascimento = null;

        while (dataNascimento == null) {
            System.out.print("Digite sua data de nascimento (AAAA-MM-DD): ");
            String entrada = scanner.nextLine().trim();
            try {
                LocalDate data = LocalDate.parse(entrada);
                if (data.isAfter(hoje)) {
                    System.out.println("A data de nascimento não pode ser posterior a hoje.");
                } else {
                    dataNascimento = data;
                }
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Use o formato AAAA-MM-DD, ex: 1995-05-20.");
            }
        }

        long diasVividos = ChronoUnit.DAYS.between(dataNascimento, hoje);

        System.out.println("Você nasceu em " + dataNascimento + " e já viveu " + diasVividos + " dias até hoje.");

        scanner.close();
    }
}

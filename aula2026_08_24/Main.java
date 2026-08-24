package aula2026_08_24;

import java.util.Scanner; // para ver respostas do usuário no terminal

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // inicializando o scanner
        Planeta plutao = new Planeta("Plutão", 2374, 1.3);

        System.out.println("Digite o nome do planeta: ");
        String resposta = sc.nextLine(); // lendo o que o usuário digitou

        System.out.println(plutao.nome);
        System.out.println(plutao.raio());
    }
}
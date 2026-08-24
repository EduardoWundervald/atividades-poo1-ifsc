package aula2026_08_24;

public class DoWhile {
    public static void main(String[] args) { // abertura da JVM
        int senhaDigitada;
        int senhaCorreta = 1234;

        do{
            System.out.println("Digite sua senha: ");
            senhaDigitada = 1234;
        } while (senhaDigitada != senhaCorreta);

        System.out.println("Acesso liberado!");
    }
}
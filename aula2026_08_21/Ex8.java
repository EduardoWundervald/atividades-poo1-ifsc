package aula2026_08_21;
import java.util.Scanner;

// 8. Verificação de Ano Bissexto para Calendário: Implemente a verificação de anos
//bissextos da regra do calendário gregoriano (divisível por 4, exceto os múltiplos de
//100 a menos que sejam múltiplos de 400) para validar datas em um formulário.

public class Ex8 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o ano: ");
        int ano = sc.nextInt();
        if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)){
            System.out.println("Ano bissexto.");
        } else {
            System.out.println("Não é bissexto.");
        }
    }
}
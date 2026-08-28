package aula2026_08_21;
import java.util.Scanner;

// 3. Menu de Atendimento Telefônico (switch-case): Crie um menu para uma central
//de suporte: 1 - Financeiro, 2 - Suporte Técnico, 3 - Cancelamento, 4 - Falar com
//Atendente. Mostre uma mensagem correspondente a cada opção e trate entradas
//inválidas via default.

public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma opção: \n1 - Financeiro\n2 - Suporte Técnico\n3 - Cancelamento\n4 - Falar com Atendente\n");
        int op = sc.nextInt();
        switch (op){
            case 1:
                System.out.print("Você acessou Financeiro");
                break;
            case 2:
                System.out.print("Você acessou Suporte Técnico");
                break;
            case 3:
                System.out.print("Você acessou Cancelamento");
                break;
            case 4:
                System.out.print("Você acessou Falar com Atendente");
                break;
            default:
                System.out.print("Opção inválida");
                break;
        }
    }
}
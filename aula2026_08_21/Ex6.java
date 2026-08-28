package aula2026_08_21;
import java.util.Scanner;

// 6. Sistema de Catraca com Tarifa Dinâmica: Leia a idade do passageiro e o horário
//do embarque (0 a 23). A tarifa base é R$ 5,00. Idosos (65+) têm gratuidade total;
//estudantes pagam 50%; se a viagem ocorrer fora do horário de pico (picos:
//07h–09h e 17h–19h), aplique mais 10% de desconto sobre o valor final.

public class Ex6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double custo = 5;
        boolean estudante = false;
        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Informe o horário do embarque (0 - 23): ");
        int horario = sc.nextInt();
        System.out.print("Possui carteirinha de estudante? S/N");
        String opcao = sc.next();
        if(opcao.equals("S")){
            estudante = true;
        } else if(opcao.equals("N")){
            estudante = false;
        } else {
            System.out.print("Opção inválida.");
        }
        if(idade >= 65){
            custo = 0;
        } else if(estudante){
            custo = (custo * 0.5);
        }
        if(!(horario >= 7 && horario <= 9 || horario >= 17 && horario <= 19)){
            custo = custo *0.90;
        }

        System.out.print("Tarifa: "+ custo);
    }
}
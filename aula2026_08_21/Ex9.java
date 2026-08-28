package aula2026_08_21;
import java.util.Scanner;

// 9. Cálculo de Adicional Noturno e Horas Extras: Leia o total de horas trabalhadas
//no mês, o valor da hora e a quantidade de horas trabalhadas no turno da noite.
//Calcule o salário considerando 50% de acréscimo para horas excedentes a 160h e
//20% de adicional sobre as horas noturnas.

public class Ex9 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o total de horas trabalhadas: ");
        int horas = sc.nextInt();
        System.out.println("Informe o valor da hora: ");
        double valorHora = sc.nextDouble();
        System.out.println("Informe a quantidade de horas noturnas trabalhadas: ");
        int horasNoturnas = sc.nextInt();

        double acrescimo = 0;
        double salarioHora = 0;
        double deducaoHora = horas - horasNoturnas;

        if(horas > 160){
            acrescimo = ((horas - 160) * (valorHora * 0.5))+(horasNoturnas*(valorHora * 0.2));
            salarioHora = horas * valorHora;
            System.out.println("Valor: "+ (salarioHora+acrescimo));
        } else if(horas <= 160){
            acrescimo = (horasNoturnas*(valorHora * 0.2));
            salarioHora = horas * valorHora;
            System.out.println("Valor: "+ (salarioHora+acrescimo));
        }

    }
}
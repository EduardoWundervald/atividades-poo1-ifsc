package aula2026_08_21;
import java.util.Scanner;

// 5. Cálculo de Consumo de Energia Elétrica por Faixa: Calcule a fatura mensal
//com base no consumo em kWh: até 100 kWh custa R$ 0,60/kWh; o que exceder
//100 até 300 kWh custa R$ 0,85/kWh; o que exceder 300 kWh custa R$ 1,10/kWh.

public class Ex5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o consumo em kWh: ");
        double consumo = sc.nextDouble();
        if(consumo <= 100){
            System.out.print("Valor a ser pago: R$"+ consumo*0.60);
        } else if(consumo >100 && consumo <= 300){
            System.out.print("Valor a ser pago: R$"+ ((100*0.60)+((consumo-100)*0.85)));
        } else if(consumo > 300){
            System.out.print("Valor a ser pago: R$"+ ((100*0.60)+(200*0.85)+((consumo-300)*1.10)));
        } else {
            System.out.print("Valor inválido");
        }
    }
}
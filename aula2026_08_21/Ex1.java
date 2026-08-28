package aula2026_08_21;
import java.util.Scanner;

//1. Cálculo de Desconto Progressivo em E-commerce: Leia o valor total de uma
//compra. Se o valor for superior a R$ 500, aplique 15% de desconto; entre R$ 200 e
//R$ 500, aplique 10%; abaixo disso, 5%. Exiba o desconto e o valor final a pagar.

public class Ex1{
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        double valor_final;
        System.out.print("Informe o valor da compra: ");
        double compra = sc.nextDouble();
        if(compra > 500){
            valor_final = compra - (compra * 0.15);
            System.out.println("Valor com desconto: " + valor_final);
        } else if(compra >= 200 && compra <= 500){
            valor_final = compra-(compra * 0.10);
            System.out.println("Valor com desconto: " + valor_final);
        } else if (compra < 200 && compra > 0){
            valor_final = compra -(compra * 0.05);
            System.out.println("Valor com desconto: " + valor_final);
        } else {
            System.out.println("Valor inválido");
        }
    }
}
package aula2026_08_21;
import java.util.Scanner;

// 2. Classificação de Score de Crédito: Receba o score de um cliente (0 a 1000) e
//classifique o risco: 0 a 300 (Risco Alto), 301 a 700 (Risco Moderado) e 701 a 1000
//(Risco Baixo). Valide se o valor inserido está dentro da faixa permitida.

public class Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe seu score: ");
        int score = sc.nextInt();

        if(score >= 0 && score <= 300){
            System.out.print("Risco alto");
        } else if(score >= 301 && score <= 700){
            System.out.print("Risco moderado");
        } else if(score >= 701 && score <=1000){
            System.out.print("Risco baixo");
        } else {
            System.out.print("Score digitado inválido");
        }
    }
}
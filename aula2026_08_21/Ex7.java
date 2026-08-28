package aula2026_08_21;
import java.util.Scanner;

// 7. Simulador de Frete por Região e Peso: Receba o código da região (1 - Sul, 2 -
//Sudeste, 3 - Centro-Oeste, 4 - Norte/Nordeste) e o peso da encomenda em kg. Use
//switch-case para definir a taxa base por kg de cada região e calcule o total.

public class Ex7 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double taxa = 0;
        System.out.println("Regiões:\n1 - Sul, \n2 - Sudeste, \n3 - Centro-Oeste, \n4 - Norte/Nordeste\nInforme o código da região: ");
        int codigo = sc.nextInt();
        System.out.println("------------------------");
        System.out.println("informe o peso da encomenda em kg: ");
        double peso = sc.nextDouble();
        switch(codigo){
            case 1:
                taxa = 10;
                break;
            case 2:
                taxa = 20;
                break;
            case 3:
                taxa = 30;
                break;
            case 4:
                taxa = 40;
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
        System.out.println("Valor do envio: R$"+ peso*taxa);
    }
}
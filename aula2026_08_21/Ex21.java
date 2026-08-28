package aula2026_08_21;
import java.util.Scanner;

// 21.PDV de Supermercado com Encerramento por Flag: Leia o valor dos produtos
//passados no caixa sucessivamente até que seja digitado o valor 0. Ao final, informe
//o total a pagar, receba o valor entregue pelo cliente e calcule o troco.

public class Ex21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double valorProduto;
        double valorFinal = 0;
        int op = 1;
        while(op != 0){
            System.out.println("Digite 1 para adicionar um produto.\nDigite 0 para Sair.");
            op = sc.nextInt();
            if(op == 1){
                System.out.print("Digite o valor para adicionar um produto: R$");
                valorProduto = sc.nextDouble();
                valorFinal = valorFinal + valorProduto;
                System.out.println("Valor atual da compra: R$" + valorFinal);
                System.out.println("--------------");
            }
        }
        System.out.println("valor final da compra: R$"+ valorFinal);
        System.out.print("Valor pago: R$");
        double valorPago = sc.nextDouble();
        if(valorFinal < valorPago){
            System.out.print("Troco: R$"+ (valorPago - valorFinal));
        }
        System.out.println("\nObrigado, volte sempre");
        System.out.println("--------------");
    }
}
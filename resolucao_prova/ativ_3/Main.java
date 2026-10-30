package resolucao_prova.ativ_3;

public class Main {
    public static void main(String [] args){

        Pedido p1 = new Pedido("Cadeira", 100.10, 10, "Padrão");
        Pedido p2 = new Pedido("Mesa", 100.10, 10, "Premium");
        Pedido p3 = new Pedido("Cadeira", 100.10, 100, "Padrão");

        System.out.printf("Teste 1 R$%.2f %n", p1.calcularValorFinal());
        System.out.printf("Teste 2 R$%.2f %n", p2.calcularValorFinal());
        System.out.printf("Teste 3 R$%.2f %n", p3.calcularValorFinal());
    }
}

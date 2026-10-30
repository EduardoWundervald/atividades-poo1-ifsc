package resolucao_prova.ativ_1;

public class Main {
    public static void main (String [] args){

        Viagem v1 = new Viagem ("Brasília", 3, 200.00, false);
        Viagem v2 = new Viagem ("São Paulo", 3, 200.00, true);
        Viagem v3 = new Viagem ("Rio de Janeiro", 6, 200.00, true);

        System.out.printf("Pendente: R$ %.2f %n", v1.calcularPagamento());
        System.out.printf("Curta: R$ %.2f %n", v2.calcularPagamento());
        System.out.printf("Longa: R$ %.2f %n", v3.calcularPagamento());

    }
}

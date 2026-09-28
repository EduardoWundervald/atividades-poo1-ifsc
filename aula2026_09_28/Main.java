package aula2026_09_28;

public class Main {
    public static void main(String [] args){

        ContaBancaria conta1 = new ContaBancaria("1001-X", "Maria Silva");

        //conta1.saldo = 100; - Incorreto, pois o saldo é Private. Só acessa saldo pelo método.
        System.out.println("Saldo de "+conta1.getTitular()+": R$"+conta1.getSaldo());
        conta1.depositar(200.0);
        conta1.sacar(100.0);
        conta1.sacar(800.0);

        System.out.println("Saldo final: R$ "+conta1.getSaldo());

    }
}

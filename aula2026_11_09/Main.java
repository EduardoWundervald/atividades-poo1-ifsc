package aula2026_11_09;

public class Main {
    public static void main (String [] args){
        System.out.println("--Sistema Funcionários--");

        Gerente gerente = new Gerente ("Flávio", 5000.00, 1000.00);
        System.out.println("\n--Gerente--");
        gerente.exibirDados();
        gerente.calcularSalario();

        Desenvolvedor dev1 = new Desenvolvedor ("Eduardo", 3500.00, "Java");
        System.out.println("\n--Desenvolvedor--");
        dev1.exibirDados();
        dev1.Programar();

        Desenvolvedor dev2 = new Desenvolvedor ("João", 3000.00, "Python");
        System.out.println("\n--Desenvolvedor--");
        dev2.exibirDados();
        dev2.Programar();

        System.out.println("--FIM DO PROGRAMA--");

    }
}

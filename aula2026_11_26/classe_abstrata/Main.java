package aula2026_11_26.classe_abstrata;

public class Main {
    public static void main (String [] args){

        Funcionario gerente = new Gerente("Pedro", 15000);
        Funcionario dev = new Desenvolvedor("João", 10000);

        gerente.exibirDados();
        dev.exibirDados();
    }
}

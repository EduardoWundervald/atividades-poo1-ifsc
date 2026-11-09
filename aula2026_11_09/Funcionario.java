package aula2026_11_09;

public class Funcionario {
    String nome;
    double salario;

    public Funcionario (String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirDados(){
        System.out.println("Nome: " +nome);
        System.out.println("Salário: R$" +salario);
    }

}
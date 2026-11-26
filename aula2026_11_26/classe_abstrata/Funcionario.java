package aula2026_11_26.classe_abstrata;

public abstract class Funcionario {
    String nome;
    double salario;

    public Funcionario (String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calcularBonus();
    public void exibirDados(){
        System.out.printf("Nome: %s | Salário: R$%.2f | Bônus: R$%.2f%n", nome, salario, calcularBonus());
    }
}

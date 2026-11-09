package aula2026_11_09;

public class Gerente extends Funcionario{
    double bonus;

    public Gerente (String nome, double salario, double bonus){
        super(nome, salario);
        this.bonus = bonus;
    }

    public void calcularSalario(){
        System.out.println("Salário total: R$" +(salario+bonus));
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Bônus: R$" +bonus);
    }

    
}

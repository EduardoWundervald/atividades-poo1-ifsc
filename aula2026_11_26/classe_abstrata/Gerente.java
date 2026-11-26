package aula2026_11_26.classe_abstrata;

public class Gerente extends Funcionario{
    
    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double calcularBonus(){
        return salario * 0.2;
    }
}

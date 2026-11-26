package aula2026_11_26.classe_abstrata;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double calcularBonus(){
        return salario * 0.10;
    }
    
}

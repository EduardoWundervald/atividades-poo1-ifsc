package aula2026_11_09;

public class Desenvolvedor extends Funcionario{
    String linguagem;

    public Desenvolvedor (String nome, double salario, String linguagem){
        super(nome, salario);
        this.linguagem = linguagem;
    }

    public void Programar(){
        System.out.println(nome+ " está programando em " +linguagem);
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Linguagem de programação: " +linguagem);
    }
    
}

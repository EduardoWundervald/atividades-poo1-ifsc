package aula2026_09_11;

public class Carro {
    double nivelCombustivel;
    String modelo;
    boolean emMovimento;

    Carro(double nivelCombustivel, String modelo, boolean emMovimento){
        this.nivelCombustivel = nivelCombustivel;
        this.modelo = modelo;
        this.emMovimento = emMovimento;
    }

    void acelerar(){
        System.out.println("Acelerando");
        System.out.println("Nível do Combustível: "+this.nivelCombustivel);
    }
    void cadastrarEstacionamento(){
        System.out.println("Cadastrando Estacionamento para "+this.modelo);
    }
}
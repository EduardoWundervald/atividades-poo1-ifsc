package aula2026_09_28;

public class ContaBancaria {

    private final String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("[Erro] Valor deve ser maior que 0");
            return;
        }
        this.saldo += valor;
        System.out.println("[SUCESSO] Depósito de R$"+valor+" realizado");
    }

    public boolean sacar(double valor){
        if(valor <= 0){
            System.out.println("[ERRO] O valor do saque deve ser positivo");
            return false;
        }
        if(valor > this.saldo){
            System.out.println("[ERRO] Saldo insuficiente");
            System.out.println("Saldo atual: "+this.saldo);
            return false;
        }

        this.saldo -= valor;
        System.out.println("[SUCESSO] Saque de R$"+valor+" realizado");
        return true;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        if(titular != null && !titular.trim().isEmpty()){ // trim tira os espaços para ver se é vazio.
            this.titular = titular;
        } else {
            System.out.println("[ERRO] Nome do titular não pode ser vazio");
        }
    }

    public double getSaldo(){
        return saldo;
    }

}
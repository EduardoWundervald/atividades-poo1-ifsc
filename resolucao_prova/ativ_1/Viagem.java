package resolucao_prova.ativ_1;

public class Viagem {
    
    private String destino;
    private int quantidadeDias;
    private double valorDiaria;
    private boolean relatorioAprovado;

    public Viagem(String destino, int quantidadeDias, double valorDiaria, boolean relatorioAprovado){
        this.destino = destino;
        this.quantidadeDias = quantidadeDias;
        this.valorDiaria = valorDiaria;
        this.relatorioAprovado = relatorioAprovado;
    }

    public String getDestino(){
        return destino;
    }

    public void setDestino(String destino){
        this.destino = destino;
    }

    public int getQuantidadeDias(){
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias){
        if(quantidadeDias <= 0){
            System.out.println("ERRO: quantidade de dias menor que zero (0)");
        } else{
            this.quantidadeDias = quantidadeDias;
        }
    }

    public double getValorDiaria(){
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria){
        if(valorDiaria <= 0){
            System.out.println("ERRO: valor da diária deve ser maior que zero (0)");
        } else {
            this.valorDiaria = valorDiaria;
        }
    }
    
    public boolean isRelatorioAprovado(){
        return relatorioAprovado;
    }

    public void setRelatorioAprovado(boolean relatorioAprovado){
        this.relatorioAprovado = relatorioAprovado;
    }

    public double calcularPagamento(){
        if(!this.relatorioAprovado){
            return 0.0;
        }
        double totalBase = this.quantidadeDias * this.valorDiaria;
        if(this.quantidadeDias > 5){
            totalBase += totalBase*0.10;
        }

        return totalBase;
    }

}

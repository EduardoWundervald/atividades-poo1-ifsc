package resolucao_prova.ativ_2;

public class OrdemServico {
    private String aparelho;
    private String status;
    private double custoPecas;

    public OrdemServico (String aparelho, String status, double custoPecas){
        setAparelho(aparelho);
        setStatus(status);
        setCustoPecas(custoPecas);
    }

    public String getAparelho(){
        return aparelho;
    }

    public void setAparelho(String aparelho){
        this.aparelho = aparelho;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        if(status != null && (status.equals("Aguardando")) || (status.equals("Em conserto")) || status.equals("Finalizado")){
            this.status = status;
        } else{
            System.out.println("ERRO: status inválido");
        }
    }

    public double getCustoPecas(){
        return custoPecas;
    }

    public void setCustoPecas(double custoPecas){
        if(custoPecas < 0){
            System.out.println("ERRO: não pode ser negativo");
        } else{
            this.custoPecas = custoPecas;
        }

    }
}

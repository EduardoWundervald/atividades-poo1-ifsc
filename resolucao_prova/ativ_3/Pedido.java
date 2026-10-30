package resolucao_prova.ativ_3;

public class Pedido {
    
    private String produto;
    private double precoUnitario;
    private int quantidade;
    private String perfilCliente;

    public Pedido(String produto, double precoUnitario, int quantidade, String perfilCliente){
        this.setProduto(produto);
        this.setPrecoUnitario(precoUnitario);
        this.setQuantidade(quantidade);
        this.setPerfilCliente(perfilCliente);
    }

    public String getProduto(){
        return produto;
    }
    public void setProduto(String produto){
        this.produto = produto;
    }

    public double getPrecoUnitario(){
        return precoUnitario;
    }
    public void setPrecoUnitario(double precoUnitario){
        if(precoUnitario < 0){
            System.out.println("ERRO: deve ser maior que zero");
        } else{
            this.precoUnitario = precoUnitario;
        }
    }

    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        if(quantidade < 0){
            System.out.println("ERRO: deve ser maior que zero");
        } else{
            this.quantidade = quantidade;
        }
    }

    public String getPerfilCliente(){
        return perfilCliente;
    }
    public void setPerfilCliente(String perfilCliente){
        this.perfilCliente = perfilCliente;
    }

    public double calcularValorFinal(){
        double subTotal = this.precoUnitario*this.quantidade;
        double valorComDescontoPerfil = subTotal;

        if("Premium".equalsIgnoreCase(this.perfilCliente)){
            valorComDescontoPerfil -= subTotal*0.15;
        } else if("Padrão".equalsIgnoreCase(this.perfilCliente)){
            valorComDescontoPerfil -= subTotal*0.05;
        }
        if(this.quantidade > 50){
            valorComDescontoPerfil -= valorComDescontoPerfil*0.10;
        }

        return valorComDescontoPerfil;
    }
}

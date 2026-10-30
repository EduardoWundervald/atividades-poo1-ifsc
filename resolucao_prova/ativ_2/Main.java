package resolucao_prova.ativ_2;

public class Main {
    public static void main (String[] args){
        OrdemServico os1 = new OrdemServico ("Geladeira", "Aguardando", 150.50);
        OrdemServico os2 = new OrdemServico ("Microondas", "Finalizado", 150.50);
        //OrdemServico os3 = new OrdemServico ();

        //os3.setAparelho("Máquina de lavar");

        System.out.println("Status inválido: Teste");
        //os3.setStatus("Quebrado");

        System.out.println("Custo negativo: Teste");
        //os3.setCustoPecas(-50.00);

        System.out.printf("OS1: %s - custo: R$ %.2f", os1.getAparelho(), os1.getStatus(), os1.getCustoPecas());
        System.out.printf("OS2: %s - custo: R$ %.2f", os2.getAparelho(), os2.getStatus(), os2.getCustoPecas());

    }
}

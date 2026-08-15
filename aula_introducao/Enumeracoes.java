package aula_introducao;

public class Enumeracoes {

enum StatusPedido{
    PENDENTE,
    ENVIADO,
    ENTREGUE,
    PAGO,
    CANCELADO
}

    public static void main (String[] arg){

        StatusPedido status = StatusPedido.PENDENTE;
        System.out.println(status);


    }
}

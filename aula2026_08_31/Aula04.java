package aula2026_08_31;
public class Aula04 {
    public static void main(String[] args){
        Celular celular1 = new Celular();
        celular1.marca = "Samsung";
        celular1.modelo = "J1";
        celular1.cor = "Preto";
        celular1.ano = 1960;

        Celular celular2 = new Celular();
        celular2.marca = "Motorola";
        celular2.modelo = "V6";
        celular2.cor = "Prata";
        celular2.ano = 2007;

        celular1.ligar();
        celular2.desligar();
        System.out.println("O modelo do celular é: " + celular2.modelo);
        System.out.println("O modelo do celular é: " + celular1.modelo);


    }
}

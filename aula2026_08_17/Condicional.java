package aula2026_08_17;

public class Condicional{
    public static void main(String args[]){
        // if-else
        int nota = 7;
        if(nota >= 7) {
            System.out.println("Aprovado");
        }else if(nota < 7 && nota >= 6) {
            System.out.println("Exame");
        } else{
            System.out.println("Reprovado");
        }

        // operador ternário
        String sitaucao = (nota >= 6) ? "Aprovado" : "Reprovado"; // operador ternário
        System.out.println(sitaucao);

        // switch-case
        int diaDaSemana = 3;

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia inválido");
        }
    }
}
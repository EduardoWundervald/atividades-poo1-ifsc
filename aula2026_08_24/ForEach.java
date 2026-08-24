package aula2026_08_24;

public class ForEach {
    public static void main(String[] args) { // abertura da JVM
        String [] frutas = {"Maçã", "Banana", "Laranja"};

        for (int i = 0; i < frutas.length; i++){
            System.out.println("Fruta: " +frutas[i]);
        }

        System.out.println("-----------");

        for(String fruta : frutas){
            System.out.println("Fruta: " + fruta);
        }
    }
}
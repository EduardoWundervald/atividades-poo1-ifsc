package aula2026_08_24;

public class While {
    public static void main(String[] args) { // abertura da JVM
        int moedas = 100;
        while (moedas > 0){
            System.out.println("Jogando... moedas restantes: "+moedas);
            moedas --;
        }
        System.out.println("Fim de jogo");
    }
}
package aula2026_08_24;

public class ForContinue {
    public static void main(String[] args) { // abertura da JVM
        for(int i = 1; i <= 5; i++){
            if (i == 3){
                continue;
            }
            System.out.println("Número: "+i);
        }
    }
}
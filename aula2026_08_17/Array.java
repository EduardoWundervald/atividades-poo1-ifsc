package aula2026_08_17;

public class Array {
    public static void main(String[] args){

        int [] numeros = new int[5];
        numeros[1] = 10;
        numeros[4] = 20;

        System.out.println(numeros[1]+" "+numeros[4]);

        int [] numeros1 = {10, 20, 30, 40, 50};
        System.out.println(numeros1[0]);
        System.out.println(numeros1[1]);
        System.out.println(numeros1[2]);
        System.out.println(numeros1[3]);
        System.out.println(numeros1[4]);

        int [] a = {1, 2, 3};
        int [] b = a;
        b[0] = 99;
        System.out.println(a[0]); // será impresso 99, porque arrays = objetos. "b" é como se fosse um link para "a"
        System.out.println("Tamanho do vetor: "+a.length);
    }
}
package aula2026_08_17;

public class Metodos{
    public static void main(String[] args){
        String nome = "Java";

        System.out.println(nome.length());// 4
        System.out.println(nome.toUpperCase()); // JAVA
        System.out.println(nome.charAt(2)); // v
        System.out.println(nome.charAt(3)); // a
        System.out.println(nome.equals("java")); // false
        System.out.println(nome.equalsIgnoreCase("java")); // true

    }
}
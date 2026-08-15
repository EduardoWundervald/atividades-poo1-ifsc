package aula_introducao;

public class Booleano {
    public static void main (String[] arg){
        boolean v1 = true, v2 = true;
        boolean f1 = false, f2 = false;

        System.out.println("Comparação lógica And");

        System.out.println(v1 && v2);
        System.out.println(v1 && f2);
        System.out.println(f1 && v2);
        System.out.println(f1 && f2);
        System.out.println(v1 || v2);
        System.out.println(v1 || f2);
        System.out.println(f1 || v2);
        System.out.println(f1 || f2);
        System.out.println(!v1);
        System.out.println(!f1);
        System.out.println(!v2);
        System.out.println(!f2);

        if (v1 && v2){
            System.out.println("V");
        } else {
            System.out.println("F");
        }
        if (v1 && f2){
            System.out.println("V");
        } else {
            System.out.println("F");
        }
        if (f1 && v2){
            System.out.println("V");
        } else {
            System.out.println("F");
        }
        if (v1 && f2){
            System.out.println("V");
        } else {
            System.out.println("F");
        }
    }
}

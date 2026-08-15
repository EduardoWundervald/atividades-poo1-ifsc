package aula2026_08_10;

public class VarComplexo {
    public static void main (String[] arg){
        boolean v1 = true, v2 = true;
        boolean f1 = false, f2 = false;

        System.out.println("Qual seria o valor da variável complexa (complexas são variáveis booleanas)");

        var complexo = v1 && !(v2 || f2);
        System.out.println(complexo);

    }
}

package aula2026_08_17;

public class Matriz {
    public static void main(String[] args) {

        int [][] matriz = new int [3][3];
        matriz [0][0] = 1;
        matriz [1][1] = 5;
        matriz [2][2] = 9;
        System.out.println(matriz [0][0]);

        int [][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(matriz1 [0][0]);

        int [][] MatrizIrregular = new int[3][];
        MatrizIrregular [0] = new int [2]; // significa que minha primeira linha terá duas colunas
        MatrizIrregular [1] = new int [4]; // 4 elementos na segunda linha
        MatrizIrregular [2] = new int [3]; // 3 elementos na terceira linha
        System.out.println(MatrizIrregular [0][0]);


    }

}
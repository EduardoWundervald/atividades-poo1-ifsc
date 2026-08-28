package aula2026_08_21;
import java.util.Scanner;

// 4. Validação de Força de Senha Básica: Leia o tamanho de uma senha (número de
//caracteres) e se ela contém caractere especial (booleano). Classifique como: Fraca
//(menos de 8 caracteres), Média (8 ou mais caracteres, sem especiais) ou Forte (8
//ou mais caracteres com especiais).

public class Ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma senha: ");
        String senha = sc.nextLine();
        int tamanho = senha.length();

        boolean temEspecial = false;
        for (int i = 0; i < tamanho; i++) {
            char c = senha.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                temEspecial = true;
                break;
            }
        }

        String classificacao;
        if (tamanho < 8) {
            classificacao = "Fraca";
        } else if (temEspecial) {
            classificacao = "Forte";
        } else {
            classificacao = "Média";
        }

        System.out.println("Tamanho: " + tamanho);
        System.out.println("Contém caractere especial: " + temEspecial);
        System.out.println("Classificação: " + classificacao);

        sc.close();
    }
}

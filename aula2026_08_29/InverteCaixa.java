package aula2026_08_29;
/*
   Teste do Capitulo 3 - Questao 10

   As letras minusculas ASCII ficam separadas das
   maiusculas por um intervalo igual a 32. Escreva um programa
   que leia caracteres do teclado, converta todas as letras
   minusculas em maiusculas e todas as maiusculas em minusculas,
   exibindo o resultado. Nao altere nenhum outro caractere.
   O programa sera encerrado quando o usuario inserir um ponto.
   No fim, ele deve exibir quantas alteracoes ocorreram na
   caixa das letras.
*/

class InverteCaixa {
  public static void main(String args[])
    throws java.io.IOException {

    char ch;
    int alteracoes = 0;

    System.out.println("Insira caracteres (ponto para encerrar).");

    do {
      ch = (char) System.in.read();

      if(ch >= 'a' && ch <= 'z') {
        ch = (char) (ch - 32);
        alteracoes++;
        System.out.print(ch);
      }
      else if(ch >= 'A' && ch <= 'Z') {
        ch = (char) (ch + 32);
        alteracoes++;
        System.out.print(ch);
      }
      else {
        System.out.print(ch);
      }
    } while(ch != '.');

    System.out.println();
    System.out.println("Alteracoes de caixa: " + alteracoes);
  }
}

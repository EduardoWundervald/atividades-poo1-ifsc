package aula2026_08_29;
/*
   Teste do Capitulo 2 - Questao 10

   Escreva um programa que encontre todos os
   numeros primos entre 2 e 100.
*/

class ListaPrimos {
  public static void main(String args[]) {
    int i, j;
    boolean isprime;

    for(i = 2; i <= 100; i++) {
      isprime = true;

      for(j = 2; j <= i/j; j++)
        if((i % j) == 0) isprime = false;

      if(isprime)
        System.out.println(i + " e primo.");
    }
  }
}

package aula2026_08_29;
/*
   Teste do Capitulo 4 - Questao 5

   Mostre como um metodo chamado myMeth( ) sera
   declarado se tiver um tipo de retorno double e dois
   parametros int chamados a e b.
*/

class MyMethDemo {

  double myMeth(int a, int b) {
    return (double) a / b; 
  }

  public static void main(String args[]) {
    MyMethDemo obj = new MyMethDemo();
    double resultado;

    resultado = obj.myMeth(10, 4);

    System.out.println("myMeth(10, 4) retornou: " + resultado);
  }
}

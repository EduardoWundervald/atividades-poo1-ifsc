package aula2026_08_14;

class PolegadaParaMetros {
  public static void main(String args[]) {
    double polegadas, metros;
    int counter;

    counter = 0;
    for(polegadas = 1; polegadas <= 144; polegadas++) {
      metros = polegadas / 39.37;
      System.out.println(polegadas + " polegadas is " +
                         metros + " metros.");

      counter++;
      if(counter == 12) {
        System.out.println();
        counter = 0;
      }
    }
  }
}

package aula2026_08_24;

public class Planeta {
    String nome = "    ";
    int diametro;
    double massa;

    public Planeta(String pNome, int pDiametro, double pMassa) {
        nome = pNome;
        diametro = pDiametro;
        massa = pMassa;
    }
    double raio(){
        return diametro/2;
    }
}
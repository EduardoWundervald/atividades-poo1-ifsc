package aula2026_09_11;

public class Main{
    public static void main(String[] args){

        BaixadorDeMusicas musica1 = new BaixadorDeMusicas("Spotify", "MP4", 17.2);

        musica1.iniciarDownload();
        System.out.println();
        musica1.dadosArquivo();
        System.out.println("--------------------------------------------");

        TimeFifa time1 = new TimeFifa("Corinthians", 1, "4-4-2");

        time1.iniciarPartida();
        System.out.println();
        time1.verTime();
        System.out.println("--------------------------------------------");

        Carro carro1 = new Carro(5, "Gol", true);

        carro1.acelerar();
        System.out.println();
        carro1.cadastrarEstacionamento();

    }
}
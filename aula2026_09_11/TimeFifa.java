package aula2026_09_11;

public class TimeFifa {

    String nomeDoTime;
    int divisaoAtual;
    String tatica;

    TimeFifa(String nomeDoTime, int divisaoAtual, String tatica){
        this.nomeDoTime = nomeDoTime;
        this.divisaoAtual = divisaoAtual;
        this.tatica = tatica;
    }

    void iniciarPartida(){
        System.out.println(nomeDoTime+" Iniciando partida");
    }
    void verTime(){
        System.out.println("Nome: "+this.nomeDoTime);
        System.out.println("Divisão Atual: "+this.divisaoAtual);
        System.out.println("Tática atual: "+this.tatica);
    }

}
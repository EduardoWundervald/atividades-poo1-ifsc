package ativ2026_11_09;

public class Publicacao {
    String titulo;
    int anoPublicacao;

    public Publicacao(String titulo, int anoPublicacao){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirInformacoes(){
        System.out.println("Título do livro: " +titulo);
        System.out.println("Ano de publicação: " +anoPublicacao);
    }
}


package aula2026_11_13.ativ_1;

public class Publicacao {
    protected String titulo;
    protected int anoPublicacao;

    public Publicacao(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano de publicação: " + anoPublicacao);
    }
}

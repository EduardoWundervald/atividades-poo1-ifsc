package ativ2026_11_09;

public class Livro extends Publicacao{
    String genero;
    int numeroPaginas;

    public Livro(String titulo, int anoPublicacao, String genero, int numeroPaginas){
        super(titulo, anoPublicacao);
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
    }

    public void verificaGenero(){
        System.out.println("O livro é de " +genero);
    }

    @Override 
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Número de páginas: " +numeroPaginas);
        System.out.println("Gênero: " +genero);
    }
}

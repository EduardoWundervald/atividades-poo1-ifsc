package aula2026_11_13.ativ_1;

public class Livro extends Publicacao {
    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, int anoPublicacao, String autor, int numeroPaginas) {
        super(titulo, anoPublicacao);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public int estimarDiasDeLeitura(int paginasPorDia) {
        return (numeroPaginas + paginasPorDia - 1) / paginasPorDia;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Tipo: Livro");
        super.exibirInformacoes();
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
}

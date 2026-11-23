package aula2026_11_13.ativ_1;

public class TCC extends Publicacao {
    private String autor;
    private String orientador;
    private String curso;

    public TCC(String titulo, int anoPublicacao, String autor, String orientador, String curso) {
        super(titulo, anoPublicacao);
        this.autor = autor;
        this.orientador = orientador;
        this.curso = curso;
    }

    public String gerarReferencia() {
        return autor + ". " + titulo + ". " + anoPublicacao + ". Trabalho de Conclusão de Curso (" + curso + ").";
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Tipo: TCC");
        super.exibirInformacoes();
        System.out.println("Autor: " + autor);
        System.out.println("Orientador: " + orientador);
        System.out.println("Curso: " + curso);
    }
}

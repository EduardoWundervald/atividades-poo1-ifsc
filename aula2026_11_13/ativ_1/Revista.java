package aula2026_11_13.ativ_1;

public class Revista extends Publicacao {
    private int numeroEdicao;
    private String periodicidade;

    public Revista(String titulo, int anoPublicacao, int numeroEdicao, String periodicidade) {
        super(titulo, anoPublicacao);
        this.numeroEdicao = numeroEdicao;
        this.periodicidade = periodicidade;
    }

    public int calcularEdicoesPorAno() {
        switch (periodicidade) {
            case "Semanal":
                return 52;
            case "Quinzenal":
                return 24;
            case "Mensal":
                return 12;
            case "Bimestral":
                return 6;
            case "Trimestral":
                return 4;
            default:
                return 1;
        }
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Tipo: Revista");
        super.exibirInformacoes();
        System.out.println("Número da edição: " + numeroEdicao);
        System.out.println("Periodicidade: " + periodicidade);
    }
}

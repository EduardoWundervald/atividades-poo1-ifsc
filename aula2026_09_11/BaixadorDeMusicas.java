package aula2026_09_11;

public class BaixadorDeMusicas {

    String plataformaOrigem;
    String formatoExportacao;
    double tamannhoArquivoMB;

    BaixadorDeMusicas(String plataformaOrigem, String formatoExportacao, double tamannhoArquivoMB) {
        this.plataformaOrigem = plataformaOrigem;
        this.formatoExportacao = formatoExportacao;
        this.tamannhoArquivoMB = tamannhoArquivoMB;
    }

    void iniciarDownload(){
        System.out.println("Iniciando download");
    }
    void dadosArquivo(){
        System.out.println("Tamanho do arquivo: "+this.tamannhoArquivoMB);
        System.out.println("Formato do arquivo: "+this.formatoExportacao);
    }

}

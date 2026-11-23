/*
 * Exercício 1
 *
 * Em um sistema de controle de biblioteca, há uma classe base chamada Publicacao,
 * que representa qualquer tipo de material disponível. Essa classe deve conter pelo
 * menos dois atributos comuns, como titulo e anoPublicacao, além de um método
 * exibirInformacoes() que mostre os dados básicos da publicação.
 *
 * As classes Livro, Revista e TCC herdam de Publicacao e devem sobrescrever o
 * método exibirInformacoes(), apresentando informações específicas de cada tipo de
 * publicação.
 *
 * Cada subclasse deve conter pelo menos dois novos atributos e um novo método além
 * dos herdados.
 *
 * No método main, crie um objeto de cada tipo (Livro, Revista e TCC), atribua
 * valores aos seus atributos e chame o método exibirInformacoes() para cada um,
 * demonstrando o uso de polimorfismo (mesmo método, comportamentos diferentes).
 */

package aula2026_11_13.ativ_1;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", 1899, "Machado de Assis", 256);
        Revista revista = new Revista("Superinteressante", 2026, 480, "Mensal");
        TCC tcc = new TCC("Sistema de Controle de Biblioteca em Java", 2025, "Ana Souza", "Carlos Lima", "Análise e Desenvolvimento de Sistemas");

        Publicacao[] publicacoes = {livro, revista, tcc};

        System.out.println("--Sistema de Biblioteca--");
        for (Publicacao publicacao : publicacoes) {
            System.out.println();
            publicacao.exibirInformacoes();
        }

        System.out.println("\n--Métodos específicos--");
        System.out.println("Lendo 20 páginas por dia, o livro leva " + livro.estimarDiasDeLeitura(20) + " dias para ser lido.");
        System.out.println("A revista tem " + revista.calcularEdicoesPorAno() + " edições por ano.");
        System.out.println("Referência do TCC: " + tcc.gerarReferencia());

        System.out.println("\n--FIM DO PROGRAMA--");
    }
}

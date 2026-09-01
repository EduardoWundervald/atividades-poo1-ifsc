package aula2026_08_31;
public class Sistema {
    String nome;
    int matricula;
    int idade;
    String curso;

    void estudar(){
        System.out.println("\n"+nome+" está estudando...");
    }
    void fazerProva(){
        System.out.println(nome+" Esta fazendo a prova...");
    }
    void apresentarTrabalho(){
        System.out.println(nome+" Está apresentando um trabalho");
    }
    void exibirInformações(){
        System.out.println("-----------------------------------");
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Matricula do aluno: " + matricula);
        System.out.println("Idade do aluno: " + idade);
        System.out.println("Curso do aluno: " + curso);
    }
}

package aula2026_11_23.agregacao;

public class Main {
    public static void main (String [] args){

        Aluno a1 = new Aluno ("Eduardo");
        Aluno a2 = new Aluno ("João");
        Aluno a3 = new Aluno ("Maria");

        Turma turma = new Turma("ADS 2");

        turma.adicionarAluno(a1);
        turma.adicionarAluno(a2);
        turma.adicionarAluno(a3);

        turma.listarAlunos();

    }
}

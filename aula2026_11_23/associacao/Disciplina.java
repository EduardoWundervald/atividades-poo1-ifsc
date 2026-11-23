package aula2026_11_23.associacao;

public class Disciplina {
    String nome;

    Disciplina (String nome){
        this.nome = nome;
    }

    public void atribuirProfessor(Professor professor){
        System.out.println(professor.nome+" ministra a disciplina "+nome);
    }
}

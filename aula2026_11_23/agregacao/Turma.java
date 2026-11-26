package aula2026_11_23.agregacao;

import java.util.List;
import java.util.ArrayList;

public class Turma {
    String identificacao;
    private List<Aluno> alunos;

    Turma (String identificacao){
        this.identificacao = identificacao;
        alunos = new ArrayList<>();
    }

    void adicionarAluno (Aluno aluno){
        alunos.add(aluno);
    }
    
    void listarAlunos(){
        System.out.println("Turma: "+identificacao);

        for (Aluno aluno : alunos){
            System.out.println("Aluno: "+aluno.nome);
        }
    }
}

package aula2026_09_14;

public class Aluno{

    String nome;
    int idade;
    int matricula;

    static int qtddeAlunos = 0;

    Aluno(String nome, int idade, int matricula){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        qtddeAlunos++;
    }

    void apresentar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Matricula: " + this.matricula);
    }

    void estudar(){
        System.out.println(nome+" está estudando");
    }
    void fazerProva(){ System.out.println(nome+" fazendo prova"); }
}
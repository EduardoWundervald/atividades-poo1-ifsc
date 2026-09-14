package aula2026_09_14;

public class Main{
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João", 19, 2025);

        /*aluno1.nome = "João";
        aluno1.idade = 19;
        aluno1.matricula = 2025;*/

        Aluno aluno2 = new Aluno("Renata", 20, 2026);

        /*aluno2.nome = "Renata";
        aluno2.idade = 20;
        aluno2.matricula = 2026;*/

        Aluno aluno3 = new Aluno("Maria", 21, 2027);
        Aluno aluno4 = new Aluno("José", 22, 2028);
        Aluno aluno5 = new Aluno("Pedro", 23, 2029);
        Aluno aluno6 = new Aluno("Henrique", 24, 2030);


        aluno1.apresentar();
        System.out.println();
        aluno2.apresentar();

        System.out.println("Alunos matriculados: "+Aluno.qtddeAlunos);

    }
}
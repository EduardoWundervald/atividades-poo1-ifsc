package aula2026_08_31;
public class SistemaMain {
    public static void main (String[] args){
        Sistema aluno1 = new Sistema();
        aluno1.nome = "João Victor";
        aluno1.matricula = 1234567;
        aluno1.idade = 18;
        aluno1.curso = "ADS - Análise Desenvovlimento de Sistemas";

        aluno1.estudar();
        aluno1.exibirInformações();
    }
}

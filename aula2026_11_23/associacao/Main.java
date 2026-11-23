package aula2026_11_23.associacao;

public class Main {
    public static void main (String [] args){
        
        Disciplina a = new Disciplina("POO");
        Professor b = new Professor("Thomas");

        a.atribuirProfessor(b);
    }
}

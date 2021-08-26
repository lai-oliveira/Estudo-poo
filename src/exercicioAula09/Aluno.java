package exercicioAula09;

public class Aluno extends Pessoa {
    private int matricula;
    public  String curso;



    public void cancelarMatricula(){

    }

    public String getCurso() {
        return curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

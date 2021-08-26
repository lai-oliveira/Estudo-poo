package exercicioAula09;

public class Professor extends Pessoa{
    private String especialidade;
    private long salario;





    public String getEspecialidade() {
        return especialidade;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void recebeAumento(float recebeAumento){
        this.salario += recebeAumento;

    }
}

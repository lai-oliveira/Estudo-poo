package aula09;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(int idade,String nome,String sexo) {
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;

    }

    public void fazerAniverssario(){
      this.idade = this.idade +1;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

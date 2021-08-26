package animal;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;

public abstract void locomover();
public abstract void alimentar();
public abstract void emitirSon();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

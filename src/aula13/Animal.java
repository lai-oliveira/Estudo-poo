package aula13;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int menbros;

    public float getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public int getMenbros() {
        return menbros;
    }

    public void setMenbros(int menbros) {
        this.menbros = menbros;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public abstract void emitirSom();
}

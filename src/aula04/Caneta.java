package aula04;

public class Caneta {
    public String modelo;
    private float ponta;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Caneta(float ponta) {
        this.ponta = ponta;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public Caneta() {

    }
}
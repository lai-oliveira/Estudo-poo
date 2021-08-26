package animal;

public class Peixe extends Animal{
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substanciais");
    }

    @Override
    public void emitirSon() {
        System.out.println("Peixe nao faz som");
    }
    public void soltarBolhas(){
        System.out.println("Soltar bolhas");
    }
}

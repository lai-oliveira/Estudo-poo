package animal;

public class Aula12 {
    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();

        m.setPeso(35.5f);
        m.setCorPelo("Preto");
        m.alimentar();
        m.locomover();
        m.emitirSon();
        c.locomover();
    }
}
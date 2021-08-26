package aula14;

public class Visualizacao {
    private Garfanhoto espectador;
    private Videos filmes;

    public Visualizacao(Garfanhoto espectador,Videos filmes) {
        this.espectador = espectador;
        this.filmes = filmes;
    }

    public Garfanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Garfanhoto espectador) {
        this.espectador = espectador;
    }

    public Videos getFilmes() {
        return filmes;
    }

    public void setFilmes(Videos filmes) {
        this.filmes = filmes;
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filmes=" + filmes +
                '}';
    }
}

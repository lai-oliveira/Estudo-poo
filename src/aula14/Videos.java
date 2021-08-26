package aula14;

public class Videos implements AcoesVideos{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Videos(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindos) {
        this.reproduzindo = reproduzindos;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void like() {

    }

    @Override
    public String toString() {
        return "Videos{" +
                "titulo='" + titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo +
                '}';
    }
}

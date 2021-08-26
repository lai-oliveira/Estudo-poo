package aula09;

public class Livros implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livros(String titulo,String autor,int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.leitor = leitor;
    }


    public String detalhes() {
        return "Livros{" +
                "titulo='" + titulo + '\'' +
                "\n, autor='" + autor + '\'' +
                "\n, totalPaginas=" + totalPaginas +
                "\n, paginaAtual=" + paginaAtual +
                "\n, aberto=" + aberto +
                "\n, leitor=" + leitor.getNome() +
                '}';
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }



    @Override
    public void abrir() {
     this.aberto=true;
    }

    @Override
    public void fechar() {
   this.aberto = false;
    }

    @Override
    public void folhear() {
       this.paginaAtual = paginaAtual;
    }



    @Override
    public void avancarPagina() {
    this.paginaAtual ++;
    }

    @Override
    public void voltarPagina() {
    this.paginaAtual --;
    }
}
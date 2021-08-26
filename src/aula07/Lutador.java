package aula07;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private   int idade;
    private long altura;
    private long peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id,long al, long pe, int vi,int de,int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.peso = pe;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }


    public void Apresentar (){
        System.out.println("--------------------------------------------------------");
    System.out.println("Chegou a hora de apresentar o lutador" + this.getNome());
    System.out.println("Diretamente de" + this.getNacionalidade());
    System.out.println("Idade : " + getIdade() + " e " + this.getAltura());
    System.out.println("Pesando" + this.getPeso() + "Kg");
    System.out.println(this.getVitorias()+ "Vitorias");
    System.out.println(this.getDerrotas()+ "Derrotas");
    System.out.println(this.getEmpates()+ "Empates");
    }
    public void Status(){
    System.out.println(this.getNome() + " e um peso " + this.getCategoria());
    System.out.println("Ganhou" + getVitorias() + "vezes");
    System.out.println("Perdeu" + this.getDerrotas() + "vezes");
    System.out.println("Perdeu" + this.getDerrotas() + "vezes");
    }
    public  void ganharLuta(){
    this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
    this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta(){
    this.setEmpates(this.getEmpates()+1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getAltura() {
        return altura;
    }

    public void setAltura(long altura) {
        this.altura = altura;
    }

    public long getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
       if (this.peso < 52.2){
           this.categoria = "invalido";
       }else if (this.peso <= 70.3){
           this.categoria = "Leve";
       }else if (this.peso <= 83.9){
           this.categoria = "Médio";
       }else if (this.peso <=120.2){
           this.categoria = "Pesado";
       }else {
           this.categoria = "Invalido";
       }
    }

    public void setPeso(long peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }



}


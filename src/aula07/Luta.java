package aula07;

import java.util.Objects;
import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiando;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;


    //Métodos Publicos


    public void lutar(){
      if (this.aprovada){
          System.out.println("--------------------Desafiando-------------------");
        this.desafiando.Apresentar();
          System.out.println("--------------------Desafiado-------------------");
        this.desafiado.Apresentar();

          Random aleatorio = new Random();
          int vencedor = aleatorio.nextInt(3);
          switch (vencedor){
                  case  0:
                      System.out.println("Empatou!");
                      this.desafiado.empatarLuta();
                      this.desafiando.empatarLuta();
                     break;
                  case  1:
                      System.out.println("Vitoria do :" + this.desafiado.getNome());
                      this.desafiado.ganharLuta();
                      this.desafiando.perderLuta();
                     break;

                  case  2:
                      System.out.println("Vitoria do : "+ this.desafiando.getNome());
                      this.desafiado.perderLuta();
                      this.desafiando.ganharLuta();
                     break;
          }

      }else {
          System.out.println("A luta não pode acontecer");
      }
    }
    public void marcarLuta(Lutador l1, Lutador l2){
       if (Objects.equals(l1.getCategoria(), l2.getCategoria()) && l1 != l2){
           this.aprovada = true;
           this.desafiado = l1;
           this.desafiando = l2;
       }else{
           this.aprovada = false;
           this.desafiado  = null;
           this.desafiando = null;
       }
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiando() {
        return desafiando;
    }

    public void setDesafiando(Lutador desafiando) {
        this.desafiando = desafiando;
    }
}

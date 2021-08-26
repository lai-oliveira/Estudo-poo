package eventos;

public class Evento {
    String nome;
    String tipoDeEvento;
    String artista;
    String convidados;
    int dia;
    int mes;


    void status() {
        System.out.println("O evento é : " + this.nome);
        System.out.println("O evento é um : " + this.tipoDeEvento);
        System.out.println("O artista é : " + this.artista);
        System.out.println("O convidados são : " + this.convidados);
        System.out.println("O dia do evento é " + this.dia + "/" + this.mes);
    }

    void eventoHoje() {
        if (this.dia == dia && this.mes == mes) {
            System.out.println("Nao esqueça que o evento é hoje");
        } else {
            System.out.println("O evento não será hoje");
        }
    }
}
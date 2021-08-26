package eventos;

public class EventosControlle {
    public static void main(String[] args) {
        Evento evento1 = new Evento();
        evento1.nome = "A festa é nossa";
        evento1.tipoDeEvento = "Show";
        evento1.artista = "Fernanda Brumm";
        evento1.convidados = " Juliana , Marcos, Patricia , Thais , Pedro";
        evento1.dia = 12;
        evento1.mes = 11;
        evento1.status();
        evento1.eventoHoje();

        Evento evento2 = new Evento();
        evento2.nome = "Adoração";
        evento2.tipoDeEvento = "Culto";
        evento2.artista = "Beatriz Andrade";
        evento2.convidados = "Jonas,Alice,Benicio,Laisa,Dani";
        evento2.dia = 30;
        evento2.mes = 06;
        evento2.status();
        evento2.eventoHoje();
    }



}
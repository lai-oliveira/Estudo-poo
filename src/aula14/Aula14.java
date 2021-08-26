package aula14;

public class Aula14 {
    public static void main(String[] args) {
        Videos v []= new Videos[3];
        v[0] = new Videos("Aula 01 poo");
        v[1] = new Videos("Aula 02 poo");
        v[2] = new Videos("Aula 03 poo");

        System.out.println(v[0].toString());

        Garfanhoto g[] = new Garfanhoto[2];
        g[0 ]= new Garfanhoto("Jonas",33,"M","juba");
        g[1] = new Garfanhoto("Laisa",33,"M","lai");
        System.out.println(g[1].toString());
    }
}
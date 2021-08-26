package aula09;

public class Aula09 {
    public static void main(String[] args) {

 Pessoa [] p = new Pessoa[2];
 Livros [] l = new Livros[3];

 p[0]=new Pessoa(22,"Maria","F");
 p[1]= new Pessoa(25,"João","M");

 l[0] = new Livros("Aprendendo Poo","Jose Guanabara",300,p[0]);
 l[1] = new Livros("Aprendendo Java","Jose Guanabara",350,p[1]);
 l[2] = new Livros("Aprendendo Java1","Jose Guanabara",390,p[1]);

        System.out.println("--------------------------------------");
        System.out.println(l[0].detalhes());
        System.out.println("--------------------------------------");
        System.out.println(l[1].detalhes());
    }
}
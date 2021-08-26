package aula011;

public class Aula011 {
    public static void main(String[] args) {
/*Visitante v1 = new Visitante();
v1.setNome("Juvenal");
v1.setSexo("M");
v1.setIdade(22);
System.out.println(v1.toString());*/
Aluno a1 = new Aluno();
a1.setMatricula(11111111);
a1.setCurso("Informatica");
a1.setNome("Laisa");
a1.setIdade(33);
a1.setSexo("F");
a1.pagarMensalidade();
System.out.println(a1.toString());

Bolsista b1 = new Bolsista();
b1.setMatricula(22222);
b1.setNome("Lua");
b1.setBolsa(12.5f);
b1.setSexo("F");
b1.pagarMensalidade();
System.out.println(b1.toString());


    }
}

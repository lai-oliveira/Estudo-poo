package exercicioAula09;

public class ExercicioAula09 {
    public static void main(String[] args) {

  Pessoa p1 = new Pessoa();
  Aluno p2 = new Aluno();
  Professor p3 = new Professor();
  Funcionario p4 = new Funcionario();


  p1.setNome("Maria");
  p2.setNome("Joao");
  p3.setNome("Claudio");
  p4.setNome("Laisa");

  p2.setCurso("Programação orientada a objeto");
  p3.setSalario(2500);
  p4.setSetor("Secretaria");

  p3.recebeAumento(250);
  p4.mudarTrabalho();
  p2.cancelarMatricula();

  System.out.println(p1.toString());
  System.out.println(p2.toString());
  System.out.println(p3.toString());
  System.out.println(p4.toString());
    }
}
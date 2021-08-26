package banco;

public class Contas {


        public static void main(String[] args) {
            ContaBanco cont01 = new ContaBanco();
            cont01.setNumConta(11111);
            cont01.setDono("Julia");
            cont01.abrirConta("CC");


            ContaBanco cont02 = new ContaBanco();
            cont02.setNumConta(12345);
            cont02.setDono("Alfredo");
            cont02.abrirConta("CP");


            cont01.depositar(300);
            cont02.depositar(500);
            cont01.estadoAtual();
            cont02.estadoAtual();


        }
    }






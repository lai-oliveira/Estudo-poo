package carro;

public class Carros {
    String modelo ;
    String cor;
    int ano;
    int quantPorta;
    boolean ligado;

    void status(){
        System.out.println("O modelo do carro é :" + this.modelo);
        System.out.println("A cor do carro é : " + this.cor);
        System.out.println("O ano do carro é :" + this.ano);
        System.out.println("O carro tem " + this.quantPorta + "portas");

    }

    void dirigir() {
        if (this.ligado == true) {
            System.out.println("Carro ligado podemos sair com segurança");
        } else {
            System.out.println("O carro está desligado");
        }
        }
    }
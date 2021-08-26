package carro;

public class Exercicio01 {
    public static void main(String[] args) {

        Carros carro1 = new Carros();
        carro1.cor = "vermelho";
        carro1.modelo = "gol";
        carro1.ano = 2020;
        carro1.quantPorta = 04;
        carro1.ligado = true;
        carro1.status();
        carro1.dirigir();

        Carros carro2 = new Carros();
        carro2.cor = "prata";
        carro2.modelo = "fox";
        carro2.ano = 2021;
        carro2.quantPorta = 02;
        carro2.ligado = false;
        carro2.status();
        carro2.dirigir();
    }
}
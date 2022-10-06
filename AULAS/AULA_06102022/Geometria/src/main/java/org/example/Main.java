package org.example;

public class Main {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(10.0, 15.0);
        Ponto p2 = new Ponto(5.0, 10.5);

        System.out.println(Geometria.calculaDistanciaPontos(p1, p2));
        System.out.println(Geometria.fatorial(5));
    }
}

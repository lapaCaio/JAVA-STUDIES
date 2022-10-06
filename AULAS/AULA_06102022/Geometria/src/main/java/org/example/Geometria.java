package org.example;

public class Geometria {
    public static double calculaDistanciaPontos(Ponto a, Ponto b) {
        double ax = a.getX();
        double ay = a.getY();

        double bx = b.getX();
        double by = b.getY();

        return Math.sqrt(Math.pow(bx - ax, 2) + Math.pow(by - ay, 2));
    }

    public static int fatorial(int n) {
        int fat = 1;

        for(int i = n; i > 1; i--){
            fat *= i;
        }

        return fat;
    }
}
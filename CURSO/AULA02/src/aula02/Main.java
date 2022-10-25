package aula02;

public class Main {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;

        c1.tampar();
        c1.status();

        System.out.println("--------------------------------------");

        Caneta c2 = new Caneta();
        c2.modelo = "Caio";
        c2.cor = "Vermelha";
        c2.destampar();
        c2.status();
    }
}
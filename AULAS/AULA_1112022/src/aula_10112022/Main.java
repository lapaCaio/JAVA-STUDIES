package aula_10112022;

public class Main {
    public static void main(String[] args) {

        Empresa e = new Empresa();

        e.addTrabalhador(new Pessoa("Darth Vader"));
        e.addTrabalhador(new Robo("R2D2"));
        e.addTrabalhador(new Alien("Xenomorfo"));

        e.mandarTrabalhar();
    }
}
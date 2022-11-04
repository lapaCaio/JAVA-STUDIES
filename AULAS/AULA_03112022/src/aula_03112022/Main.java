package aula_03112022;

public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.fiscalizar();
        g.trabalhar();

        Vendedor v = new Vendedor();
        v.trabalhar();

        Funcionario f = new Gerente();
        f.trabalhar();
    }
}
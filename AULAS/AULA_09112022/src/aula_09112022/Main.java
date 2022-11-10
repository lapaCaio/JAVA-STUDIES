package aula_09112022;

public class Main {
    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[3];

        funcionarios[0] = new Gerente();
        funcionarios[1] = new Vendedor();
        funcionarios[2] = new Vendedor();

        for (Funcionario lista : funcionarios) {
            lista.trabalhar();
        }

        Main prog = new Main();
        Main.main(args);

        Object mulher = new Object();
    }
}
package aula010;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

    }
}
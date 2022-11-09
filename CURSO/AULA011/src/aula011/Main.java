package aula011;

public class Main {
    public static void main(String[] args) {

        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();

        Pessoa[] teste = new Pessoa[3];
        teste[0] = new Aluno();
        teste[1] = new Bolsista();
        teste[2] = new Visitante();
    }
}
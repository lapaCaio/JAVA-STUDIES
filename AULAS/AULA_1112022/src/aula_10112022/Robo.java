package aula_10112022;

public class Robo implements Trabalhador{

    private String identificador;

    public Robo(String identificador) {
        this.identificador = identificador;
    }

    @Override
    public void trabalhar() {
        System.out.println("O robô " + getIdentificador() + " está trabalhando!");
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

}

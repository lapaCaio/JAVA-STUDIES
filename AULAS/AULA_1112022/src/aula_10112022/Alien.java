package aula_10112022;

import java.util.Objects;

public class Alien implements Trabalhador{
    private String especie;

    public Alien(String especie) {
        this.especie = especie;
    }

    @Override
    public void trabalhar() {
        if(Objects.equals(getEspecie(), "Xenomorfo")){
            System.out.println(getEspecie() + " está caçando astronautas!");
        }else {
            System.out.println(getEspecie() + " está trabalhando!");
        }
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}

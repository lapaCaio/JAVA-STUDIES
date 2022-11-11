package aula_10112022;

import java.util.Objects;

public class Pessoa implements Trabalhador{

    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public void trabalhar() {
        if(Objects.equals(getNome(), "Darth Vader")){
            System.out.println(getNome() + " está tentando dominar a galáxia!");
        }else {
            System.out.println(getNome() + " está trabalhando!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

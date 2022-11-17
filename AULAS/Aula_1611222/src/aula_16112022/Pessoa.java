package aula_16112022;

public class Pessoa<E, T> {
    private String nome;
    private E ID;
    private T peso;

    public Pessoa(String nome, E ID, T peso) {
        this.nome = nome;
        this.ID = ID;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public E getID() {
        return ID;
    }

    public void setID(E ID) {
        this.ID = ID;
    }

    public T getPeso() {
        return peso;
    }

    public void setPeso(T peso) {
        this.peso = peso;
    }
}

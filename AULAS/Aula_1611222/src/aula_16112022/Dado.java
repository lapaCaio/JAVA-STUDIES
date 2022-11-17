package aula_16112022;

public class Dado<E> {
    private E dado;

    public Dado(E dado){
        this.dado = dado;
    }

    public E getDado() {
        return dado;
    }

    public void setDado(E dado) {
        this.dado = dado;
    }
}

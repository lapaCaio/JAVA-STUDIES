package lp.caio;

public class Bebida extends Produto{

    public Bebida(double valor) {
        super(valor);
    }

    public String toString(){
        return "Valor: " + getValor();
    }
}

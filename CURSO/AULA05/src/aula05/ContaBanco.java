package aula05;

import java.util.Objects;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    Boolean status;

    public ContaBanco() {
        saldo = 0;
        status = false;
    }

    public void abrirConta(String tipo){
        setTipo(tipo);
        setStatus(true);

        if(Objects.equals(tipo, "CC")) {
            setSaldo(50);
        } else if (Objects.equals(tipo, "CP")) {
            setSaldo(150);
        }
    }

    public void fecharConta(){
        if(getSaldo() > 0){
            System.out.println("Conta com dinheiro!");
        } else if (getSaldo() < 0) {
            System.out.println("Conta em débito!");
        }else{
            setStatus(false);
        }
    }

    public void depositar(float valor){
        if(getStatus()){
            setSaldo(getSaldo() + valor) ;
        }else{
            System.out.println("Impossível depositar!");
        }
    }

    public void sacar(float valor){
        if(getStatus() && getSaldo() > 0){
            setSaldo(getSaldo() - valor);
        }else{
            System.out.println("Impossível sacar!");
        }
    }
    public void pagarMensal(){
        float mensalidade = 0;
        if(Objects.equals(tipo, "CC")){
            mensalidade = 12f;
        } else if (Objects.equals(tipo, "CP")) {
            mensalidade = 20f;
        }
        if(getStatus() && getSaldo() > 0){
            setSaldo(getSaldo() - mensalidade);
        }else{
            System.out.println("Impossível pagar!");
        }
    }

    public int getNumConta(){
        return numConta;
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getDono(){
        return dono;
    }
    public void setDono(String dono){
        this.dono = dono;
    }

    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public boolean getStatus(){
        return status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
}
//conta corrente ganha 50, conta poupança ganha 150

//não posso fechar conta no debito ou com dinheiro

//depositar só com status verdadeiro

//sacar só com dinheiro ou com status verdadeiro

//mensalidade cobra 12 pila, poupança paga 20
package aula_14122022;

public class Conta {
    private int numConta;
    private double saldo;

    public Conta(int numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saca(double valor) extends IllegalArgumentException {
        if(valor > saldo){
            throw new SaldoInsuficienteException("Não tem saldo!");
        }else{
            saldo -= valor;
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numConta=" + numConta +
                ", saldo=" + saldo +
                '}';
    }
}

package lp.caio;

public class Pessoa {
    private int idade;

    public void setIdade(int idade){  //setter -> é void; usado para alterar;
        this.idade = idade;
    }

    public int getIdade(){  //getter -> o tipo pode variar; usado para pegar algum valor;
        return idade;
    }

    public void darPulos(){
        for(int p = 0; p < idade; p++){
            System.out.println("Pulei" + (p + 1) + " vez(es)!");
        }
    }
}

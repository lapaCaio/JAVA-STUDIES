package lp.caio;

public class Pessoa {
    private String nome;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        if(!nome.equals("")){
            this.nome = nome;
        }
    }
}

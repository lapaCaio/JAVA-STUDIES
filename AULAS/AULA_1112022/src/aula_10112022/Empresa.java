package aula_10112022;

public class Empresa {
    private Trabalhador[] funcionarios;
    private int ultimo;

    public Empresa(){
        funcionarios = new Trabalhador[3];
        ultimo = 0;
    }

    public void addTrabalhador(Trabalhador t){
        if(ultimo < funcionarios.length){
            funcionarios[ultimo++] = t;
        }
    }

    public void mandarTrabalhar(){
        for(int i = 0; i < ultimo; i++){
            funcionarios[i].trabalhar();
        }
    }
}

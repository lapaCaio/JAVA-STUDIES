package aula011;

public class Bolsista extends Aluno {
    private int bolsa;

    public void RenovarBolsa(){

    }
    @Override
    public void PagarMensalidade(){
        RenovarBolsa();
    }
}

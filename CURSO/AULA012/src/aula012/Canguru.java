package aula012;

public class Canguru extends Mamifero{
    public void usarBolsa(){
        System.out.println("O canguru usou a bolsa!");
    }

    @Override
    public void locomover(){
        System.out.println("Pulando!");
    }
}

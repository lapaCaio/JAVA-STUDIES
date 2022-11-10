package aula012;

public class Goldfish extends Peixe{
    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.print(" (em ouro!)");
    }
}

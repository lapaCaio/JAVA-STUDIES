package aula012;

public class Reptil extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Correndo assustadoramente!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo alimentos de répteis!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Sons de Répteis!");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}

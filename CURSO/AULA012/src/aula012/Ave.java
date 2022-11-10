package aula012;

public class Ave extends Animal{

    private String corPena;

    public void fazerNinho(){
        System.out.println("Fazendo um ninho!");
    }

    @Override
    public void locomover() {
        System.out.println("Voando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo minhocas!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Sons de aves!");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}

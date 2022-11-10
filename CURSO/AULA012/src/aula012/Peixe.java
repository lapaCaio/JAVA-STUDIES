package aula012;

public class Peixe extends Animal{
    private String corEscama;

    public void soltarBolhas(){
        System.out.println("Glub!Glub! ...");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo anzóis!");
    }

    @Override
    public void emitirSom() {
        soltarBolhas();
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}

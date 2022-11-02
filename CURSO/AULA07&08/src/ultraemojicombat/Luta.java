package ultraemojicombat;

import java.util.Objects;
import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if(Objects.equals(l1.getCategoria(), l2.getCategoria()) && !Objects.equals(l1, l2)){
            setAprovada(true);
            setDesafiado(l1);
            setDesafiante(l2);
        }else{
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
        }
    }
    public void lutar(){
        if(isAprovada()){
            System.out.println("### DESAFIANTE ###");
            getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            getDesafiante().apresentar();

            Random alatorio = new Random();
            int vencedor = alatorio.nextInt(3);


            switch (vencedor) {
                case 0 -> {
                    System.out.println("Empatou!");
                    getDesafiado().empatarLuta();
                    getDesafiante().empatarLuta();
                }
                case 1 -> {
                    System.out.println("Vitória do " + getDesafiado().getNome());
                    getDesafiado().ganharLuta();
                    getDesafiante().perderLuta();
                }
                case 2 -> {
                    System.out.println("Vitória do " + getDesafiante().getNome());
                    getDesafiado().perderLuta();
                    getDesafiante().ganharLuta();
                }
            }
        }else{
            System.out.println("A luta não pode acontecer!");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}

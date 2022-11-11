package aula014;

public class Main {
    public static void main(String[] args) {

        Video[] v = new Video[3];
        v[0] = new Video("Aula de POO");
        v[1] = new Video("Chainsawman Full OP - 1 hour");
        v[2] = new Video("Rock Lee vs Gaara - Link Park");

        System.out.println(v[2].toString());
    }
}
package aula014;

public class Main {
    public static void main(String[] args) {

        Video[] v = new Video[3];
        v[0] = new Video("Aula de POO");
        v[1] = new Video("Chainsawman Full OP - 1 hour");
        v[2] = new Video("Rock Lee vs Gaara - Link Park");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileia", 22, "F", "Jubs");
        g[1] = new Gafanhoto("Caio", 20, "M", "C41OP3RLP");

        System.out.println(v[2].toString());

        Visualizacao vis = new Visualizacao(g[0], v[2]);
        System.out.println(vis.toString());
    }
}
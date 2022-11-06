package projetolivro;

public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");

        l[0] = new Livro("ManJava", "José da Silva", 300, p[0]);
        l[1] = new Livro("IntelliJ(entes)", "Geraldo Morro", 527, p[1]);
        l[2] = new Livro("Javançado", "Maria Klecks", 435, p[0]);

        l[0].abrir();

        System.out.println(l[0].detalhes());

    }
}
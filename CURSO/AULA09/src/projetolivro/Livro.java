package projetolivro;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", totPaginas=" + totPaginas +
                ", pagAtual=" + pagAtual +
                ", aberto=" + aberto +
                ", leitor='" + leitor.getNome() + '\'' +
                ", idade='" + leitor.getIdade() + '\'' +
                ", sexo='" + leitor.getSexo() + '\''+
                '}';
    }

    @Override
    public void abrir(boolean aberto) {
        setAberto(true);
    }

    @Override
    public void fechar() {

    }

    @Override
    public void folhear(int p) {
        if(p > getTotPaginas()) {
            setPagAtual(getPagAtual() + p);
        }
    }

    @Override
    public void avacarPag() {
        setPagAtual(getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        setPagAtual(getPagAtual() - 1);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

}

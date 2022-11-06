package projetolivro;

public interface Publicacao {
    abstract void abrir(boolean aberto);
    abstract void fechar();
    abstract void folhear(int p);
    abstract void avacarPag();
    abstract void voltarPag();

}

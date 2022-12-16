package aula_14122022;

public class Main {
    public static void main(String[] args) {

        Conta c1 = new Conta(1134, 34.00);
        Conta c2 = new Conta(2344, 65.00);

        System.out.println(c1);
        System.out.println(c2);
        c1.saca(34);

        try{
            c1.saca(1.0);
        }catch(IllegalArgumentException meuObjeto){
            meuObjeto.getMessage();
        }
    }
}
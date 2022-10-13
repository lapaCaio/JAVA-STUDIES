package lp.caio;

import java.util.Scanner;
import lp.caio.Pessoa;

public class Main {
    public static void main(String[] args) {

        Scanner meuScanner = new Scanner(System.in);
        Pessoa[] vetPessoas = new Pessoa[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Digite o nome: ");
            String tempNome = meuScanner.nextLine();

            System.out.println("Digite a idade: ");
            int tempIdade = meuScanner.nextInt();

            vetPessoas[i] = new Pessoa(tempNome, tempIdade);

            meuScanner.nextLine();
        }

        System.out.print("\n\n\n");

        for(int i = 0; i < 5; i++){
            System.out.println("Nome: " + vetPessoas[i].getNome() + "\nIdade: " + vetPessoas[i].getIdade());
        }
    }
}
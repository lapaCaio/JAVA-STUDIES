package exercicios;

import java.util.Scanner;
import java.util.InputMismatchException;



public class Exercicio01 {
    private Double firstNumber;
    private Double secondNumber;

    void colectInput(){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        try {
            setFirstNumber(s.nextDouble());
        } catch (InputMismatchException e) {
            throw new InputMismatchException("colectInput()");
        }
        System.out.println("Digite o segundo número: ");
        try {
            setSecondNumber(s.nextDouble());
        } catch (Exception e) {
            throw new InputMismatchException("ERRO: O valor digitado não é um número!");
        }


        s.close();
    }

    public Double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(Double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public Double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(Double secondNumber) {
        this.secondNumber = secondNumber;
    }
}

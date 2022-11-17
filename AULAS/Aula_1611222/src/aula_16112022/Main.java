package aula_16112022;

public class Main {
    public static void main(String[] args) {

        Dado<String> d = new Dado<>("qualquer string");
        System.out.println(d.getDado());

        Dado<Integer> d2 = new Dado<>(10);
        System.out.println(d2.getDado());

    }
}

/*
* condicao = True
* result = null
*
* while condicao:
*   result = pyautogui.locateCenterOnScreen("imagem.png", 1)
*
*   x,y =
*
*   if result != ImageNotFoundException:  //----
*       condicao = False
*
*
*  # testar o funcionamento disso aqui durante a interpretação do código
* */
package lp.caio;

public class Matriz {
    public static void main(String[] args) {
        int linhas = 3;
        int colunas = 3;

        int [][]matriz = new  int [linhas][colunas];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (1 + j + i) * (i + j);
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}

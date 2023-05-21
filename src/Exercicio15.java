/* Nome do Aluno: Gustavo Antonelli de Souza
* RA: 12523123648
* Nome do Programa: Exercicio15
* Data: 21/05
*/

public class Exercicio15 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        // Preenche a matriz com zeros
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0;
            }
        }

        // Imprime a matriz preenchida com zeros
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

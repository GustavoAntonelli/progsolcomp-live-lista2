/* Nome do Aluno: Gustavo Antonelli de Souza
* RA: 12523123648
* Nome do Programa: Exercicio19
* Data: 21/05
*/

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o volume inicial em centímetros cúbicos: ");
        int volumeInicial = scanner.nextInt();

        int volume = volumeInicial;
        int tempo = 0;

        while (volume <= 1000) {
            volume *= 2;
            tempo++;
        }

        System.out.println("O volume ultrapassou 1000 cm³ em " + tempo + " segundos.");
    }
}

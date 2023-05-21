/* Nome do Aluno: Gustavo Antonelli de Souza
* RA: 12523123648
* Nome do Programa: Exercicio16
* Data: 21/05
*/

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número (digite um número menor que 0 para sair): ");
        numero = scanner.nextInt();

        while (numero >= 0) {
            System.out.print("Digite um número (digite um número menor que 0 para sair): ");
            numero = scanner.nextInt();
        }
    }
}

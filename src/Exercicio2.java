/* Nome do Aluno: Gustavo Antonelli de Souza
* RA: 12523123648
* Nome do Programa: Exercicio2
* Data: 21/05
*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = scanner.nextInt();

        if (a <= b && a <= c) {
            System.out.print(a + ", ");
            if (b <= c) {
                System.out.print(b + ", " + c);
            } else {
                System.out.print(c + ", " + b);
            }
        } else if (b <= a && b <= c) {
            System.out.print(b + ", ");
            if (a <= c) {
                System.out.print(a + ", " + c);
            } else {
                System.out.print(c + ", " + a);
            }
        } else {
            System.out.print(c + ", ");
            if (a <= b) {
                System.out.print(a + ", " + b);
            } else {
                System.out.print(b + ", " + a);
            }
        }
    }
}

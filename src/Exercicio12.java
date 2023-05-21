/* Nome do Aluno: Gustavo Antonelli de Souza
* RA: 12523123648
* Nome do Programa: Exercicio12
* Data: 21/05
*/

public class Exercicio12 {
    public static void main(String[] args) {
        int numero = 0;

        do {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        } while (numero % 7 != 0);
    }
}

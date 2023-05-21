/* Nome do Aluno: Gustavo Antonelli de Souza
* RA: 12523123648
* Nome do Programa: Exercicio13
* Data: 21/05
*/

public class Exercicio13 {
    public static void main(String[] args) {
        int numero = 1;
        int soma = 0;

        while (numero <= 100) {
            soma += numero;
            numero++;
        }

        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}

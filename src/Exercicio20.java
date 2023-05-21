/* Nome do Aluno: Gustavo Antonelli de Souza
* RA: 12523123648
* Nome do Programa: Exercicio20
* Data: 21/05
*/

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a carga máxima do elevador em kg: ");
        int cargaMaxima = scanner.nextInt();

        System.out.print("Digite a quantidade máxima de pessoas no elevador: ");
        int quantidadeMaxima = scanner.nextInt();

        int cargaAtual = 0;
        int quantidadeAtual = 0;

        do {
            System.out.print("Digite o peso da pessoa em kg: ");
            int peso = scanner.nextInt();

            cargaAtual += peso;
            quantidadeAtual++;

        } while (cargaAtual < cargaMaxima && quantidadeAtual < quantidadeMaxima);

        System.out.println("A carga máxima do elevador foi atingida ou o número máximo de pessoas foi atingido.");
        System.out.println("Carga atual: " + cargaAtual + " kg");
        System.out.println("Quantidade atual: " + quantidadeAtual + " pessoas");
    }
}

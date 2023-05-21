/* Nome do Aluno: Gustavo Antonelli de Souza
* RA: 12523123648
* Nome do Programa: Exercicio5
* Data: 21/05
*/

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Digite a naturalidade: ");
        String naturalidade = scanner.nextLine();

        System.out.print("Deseja visualizar os dados completos? (S/N): ");
        char opcao = scanner.nextLine().charAt(0);

        if (opcao == 'S' || opcao == 's') {
            System.out.println("Nome: " + nome);
            System.out.println("Sobrenome: " + sobrenome);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Naturalidade: " + naturalidade);
        } else if (opcao == 'N' || opcao == 'n') {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade + " anos");
        } else {
            System.out.println("Digitação errada. Tente novamente.");
        }
    }
}

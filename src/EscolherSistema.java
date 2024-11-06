import java.util.InputMismatchException;
import java.util.Scanner;

public class EscolherSistema {
    public int obterEscolha() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        boolean opcaoValida = false;

        // Repetido ate termos uma opção válida
        while (!opcaoValida) {
            System.out.println("Escolha o sistema de pagamento:");
            System.out.println("1 - Novo Sistema");
            System.out.println("2 - Sistema Antigo (usando Adapter)");
            System.out.print("Opção: ");

            try {
                opcao = scanner.nextInt();
                if (opcao == 1 || opcao == 2) {
                    opcaoValida = true; // Sai do loop se a opção for válida
                } else {
                    System.out.println("Opção inválida. Escolha entre 1 e 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida para a opção. Por favor, insira um número inteiro.");
                scanner.next(); // Limpa a entrada inválida
            }
        }
        return opcao;
    }
}

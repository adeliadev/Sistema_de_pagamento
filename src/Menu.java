import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private final NovoSistemaPagamento novoSistema;
    private final NovoSistemaPagamento adapter;

    public Menu(NovoSistemaPagamento novoSistema, NovoSistemaPagamento adapter) {
        this.novoSistema = novoSistema;
        this.adapter = adapter;
    }

    public void exibirMenu() {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor do pagamento: R$");
            double valor = scanner.nextDouble();

            if (valor <= 0) {
                throw new IllegalArgumentException("O valor do pagamento não pode ser negativo!");
            }

            System.out.println("Escolha o sistema de pagamento:");
            System.out.println("1 - Novo sistema");
            System.out.println("2 - Sistema antigo [utilizando o padrão Adapter]");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            processarPagamento(opcao, valor);
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Entrada inválida. Por favor, insira um número.");
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }

    private void processarPagamento(int opcao, double valor) {
        switch (opcao) {
            case 1:
                novoSistema.processarPagamento(valor);
                break;
            case 2:
                adapter.processarPagamento(valor);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}


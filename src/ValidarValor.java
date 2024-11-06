import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidarValor {
    public double obterValor() {
        Scanner scanner = new Scanner(System.in);
        double valor = 0;
        boolean valorValido = false;

        // Repetido até termos um valor válido
        while (!valorValido) {
            try {
                System.out.print("Digite o valor do pagamento: R$");
                valor = scanner.nextDouble();

                if (valor <= 0) {
                    throw new IllegalArgumentException("O valor do pagamento não pode ser negativo.");
                }

                valorValido = true;
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Entrada inválida. Por favor, insira um número.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println("ERRO: " + e.getMessage());
            }
        }
        return valor;
    }
}

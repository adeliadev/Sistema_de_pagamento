public class NovoSistemaPagamentoImpl implements NovoSistemaPagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Processando pagamento de R$ %.2f no novo sistema\n", valor);
    }
}

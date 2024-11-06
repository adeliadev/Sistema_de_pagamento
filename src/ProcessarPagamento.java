public class ProcessarPagamento {
    private final NovoSistemaPagamento novoSistema;
    private final NovoSistemaPagamento adapter;

    public ProcessarPagamento(NovoSistemaPagamento novoSistema, NovoSistemaPagamento adapter) {
        this.novoSistema = novoSistema;
        this.adapter = adapter;
    }

    // Retorna o sistema escolhido pelo usuário
    public void processar(int opcao, double valor) {
        if (opcao == 1) {
            novoSistema.processarPagamento(valor);
        } else {
            adapter.processarPagamento(valor);
        }
    }
}

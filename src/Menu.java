public class Menu {
    private final ValidarValor validadorDeValor;
    private final EscolherSistema escolhaSistemaPagamento;
    private final ProcessarPagamento processadorPagamento;

    public Menu(ValidarValor validadorDeValor, EscolherSistema escolhaSistemaPagamento, ProcessarPagamento processadorPagamento) {
        this.validadorDeValor = validadorDeValor;
        this.escolhaSistemaPagamento = escolhaSistemaPagamento;
        this.processadorPagamento = processadorPagamento;
    }

    public void exibirMenu() {
        double valor = validadorDeValor.obterValor();
        int opcao = escolhaSistemaPagamento.obterEscolha();
        processadorPagamento.processar(opcao, valor);
    }
}

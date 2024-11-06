public class Main {
    public static void main(String[] args) {

        // Instâncias dos sistemas de pagamento
        NovoSistemaPagamento novoSistema = new NovoSistemaPagamentoImpl();
        SistemaAntigoPagamento sistemaAntigo = new SistemaAntigoPagamento();
        NovoSistemaPagamento adapter = new AdapterSistemaPagamento(sistemaAntigo);

        // Classes com os métodos de apoio
        ValidarValor validadorDeValor = new ValidarValor();
        EscolherSistema escolhaSistemaPagamento = new EscolherSistema();
        ProcessarPagamento processadorPagamento = new ProcessarPagamento(novoSistema, adapter);

        // Exibe o menu de opções
        Menu menu = new Menu(validadorDeValor, escolhaSistemaPagamento, processadorPagamento);
        menu.exibirMenu();
    }
}

public class Main {
    public static void main(String[] args) {
        // Usando o novo sistema diretamente
        NovoSistemaPagamento novoSistema = new NovoSistemaPagamentoImpl();
        novoSistema.processarPagamento(100.0);

        // Usando o sistema antigo com o Adapter
        SistemaAntigoPagamento sistemaAntigo = new SistemaAntigoPagamento();
        NovoSistemaPagamento adapter = new AdapterSistemaPagamento(sistemaAntigo);
        adapter.processarPagamento(200.0);
    }
}

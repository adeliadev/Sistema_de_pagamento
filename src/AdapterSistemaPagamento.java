public class AdapterSistemaPagamento implements NovoSistemaPagamento {
    private final SistemaAntigoPagamento sistemaAntigo;

    public AdapterSistemaPagamento(SistemaAntigoPagamento sistemaAntigo) {
        this.sistemaAntigo = sistemaAntigo;
    }

    @Override
    public void processarPagamento(double valor) {
        sistemaAntigo.pagar(valor);
    }
}
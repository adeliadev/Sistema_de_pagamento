public class Main {
    public static void main(String[] args) {

        // Instâncias das classes
        NovoSistemaPagamento novoSistema = new NovoSistemaPagamentoImpl();
        SistemaAntigoPagamento sistemaAntigo = new SistemaAntigoPagamento();
        NovoSistemaPagamento adapter = new AdapterSistemaPagamento(sistemaAntigo);

        // Instância do menu de opções
        Menu menu = new Menu(novoSistema, adapter);
        menu.exibirMenu();
    }
}

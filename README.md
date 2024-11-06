# 💵 Sistema de Pagamento com Padrão Adapter
Este projeto é um sistema de pagamento simples implementado em Java, utilizando o padrão Adapter para integrar diferentes sistemas de pagamento. O projeto inclui entrada e validação de dados do usuário, e está organizado com uma estrutura modular para facilitar a manutenção e expansão.

## 🏗️ Estrutura do Projeto
O projeto está dividido em classes com responsabilidades específicas:

- ```ValidadorDeValor:``` Responsável por capturar e validar o valor do pagamento inserido pelo usuário.
- ```EscolhaSistemaPagamento:``` Responsável por capturar e validar a escolha do sistema de pagamento.
- ```ProcessadorPagamento:``` Processa o pagamento utilizando o sistema de pagamento escolhido.
- ```Menu:``` Classe principal que coordena as outras classes, exibindo o menu e gerenciando o fluxo de interação com o usuário.
- ```Main:``` Classe de execução, responsável por iniciar o sistema.

## 💳 Classes de pagamento:
- ```Interface NovoSistemaPagaemnto```
- ```Classe NovoSistemaPagamentoImpl```
- ```Classe SistemaAntigoPagamento```
- ```Classe AdapterSistemaPagamento```

## 📜 Estrutura do Código Principal
Abaixo estão as classes principais que compõem o sistema de menu:

- ```ValidadorDeValor:``` Recebe e valida o valor do pagamento, garantindo que seja um número positivo.
- ```EscolhaSistemaPagamento:``` Recebe e valida a escolha do usuário para o sistema de pagamento, garantindo que a escolha seja 1 ou 2.
- ```ProcessadorPagamento:``` Executa o pagamento no sistema selecionado.
- ```Menu:``` Orquestra a execução do sistema, utilizando as classes acima para capturar e validar a entrada e processar o pagamento.
- ```Main:``` Classe principal que inicializa as classes e exibe o menu.

## 💻 Tecnologias usadas:
- Java 22

## 🚀 Exemplo de Uso
Para rodar o sistema, execute a classe Main. O sistema pedirá ao usuário:

1. Um valor para o pagamento (positivo).
2. ```A escolha do sistema de pagamento:``` Novo sistema de pagamento ou Sistema antigo de pagamento (com Adapter).

O sistema processará o pagamento com o sistema correspondente, exibindo mensagens confirmando o processamento.

## ▶️ Como Executar o Projeto
1. Clone o repositório ou copie o código para seu ambiente local.
2. Compile e execute a classe Main.
3. Siga as instruções no terminal para interagir com o sistema de pagamento.

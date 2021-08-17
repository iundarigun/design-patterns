package cat.ocanalias.designpatterns.command.solucao;

import java.math.BigDecimal;

public class Principal {
    /**
     * A solução passa por encapuslar a lógica dentro de uma classe
     * https://refactoring.guru/design-patterns/command
     */
    public static void main(String[] args) {
        final BigDecimal orcamento = new BigDecimal(600);
        final Command pedidoCommand = new GerarPedido("Fulano",  orcamento);
        pedidoCommand.executa();
    }
}

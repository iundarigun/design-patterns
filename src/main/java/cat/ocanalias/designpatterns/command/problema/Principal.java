package cat.ocanalias.designpatterns.command.problema;

import cat.ocanalias.designpatterns.command.EmailService;
import cat.ocanalias.designpatterns.command.Pedido;
import cat.ocanalias.designpatterns.command.PedidoRepository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Principal {
    /**
     * O problema aqui é que a lógica atrelada à pedido fica dentro do main (ou api rest, etc)
     * Então se em algum outro ponto do código precisa fazer a mesma ação, vai precisar duplicar o
     * código.
     *
     */
    public static void main(String[] args) {
        final BigDecimal orcamento = new BigDecimal(600);
        final Pedido pedido = new Pedido("Fulano", LocalDateTime.now(), orcamento);
        // Salvar pedido
        getPedidoRepository().salvarPedido(pedido);
        // Mandar email
        getEmailService().mandarEmail(pedido.getCliente(), "Pedido gerado");
    }

    private static PedidoRepository getPedidoRepository(){
        return new PedidoRepository();
    }

    private static EmailService getEmailService(){
        return new EmailService();
    }
}

package cat.ocanalias.designpatterns.command.solucao;

import cat.ocanalias.designpatterns.command.EmailService;
import cat.ocanalias.designpatterns.command.Pedido;
import cat.ocanalias.designpatterns.command.PedidoRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class GerarPedido implements Command {
    private final String cliente;
    private final BigDecimal orcamento;

    @Override
    public void executa() {
        final Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);
        // Salvar pedido
        new PedidoRepository().salvarPedido(pedido);
        // Mandar email
        new EmailService().mandarEmail(pedido.getCliente(), "Pedido gerado");
    }
}

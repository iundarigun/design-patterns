package cat.ocanalias.designpatterns.adapter.solucao;

import cat.ocanalias.designpatterns.adapter.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Principal {

    /**
     * Criamos uma interfaces que é usada para encapsular essas infos,
     * abstraindo os detalhes de infrastrutura
     *
     * https://refactoring.guru/design-patterns/adapter
     */
    public static void main(String[] args) {
        final BigDecimal orcamento = new BigDecimal(600);
        final Pedido pedido = new Pedido("Fulano", LocalDateTime.now(), orcamento);

        new RegistrarPedidoApi(new BasicHttpAdapter()).registrar(pedido);
    }
}

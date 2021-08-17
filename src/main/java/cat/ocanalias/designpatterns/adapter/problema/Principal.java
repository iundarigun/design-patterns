package cat.ocanalias.designpatterns.adapter.problema;

import cat.ocanalias.designpatterns.adapter.Pedido;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Principal {

    /**
     * A implementação da chamada na api fica acoplada, o que implica que precisamos alterar a classe
     * caso decidamos usar outro tipo de lib para a requisição
     */
    public static void main(String[] args) throws IOException {
        final BigDecimal orcamento = new BigDecimal(600);
        final Pedido pedido = new Pedido("Fulano", LocalDateTime.now(), orcamento);
        new RegistrarPedidoApi().registrar(pedido);
    }
}

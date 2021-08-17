package cat.ocanalias.designpatterns.proxy.solucao;

import cat.ocanalias.designpatterns.proxy.Pedido;

import java.math.BigDecimal;

public class PedidoProxy extends Pedido {

    private BigDecimal valor;
    private final Pedido pedido;

    public PedidoProxy(Pedido pedido) {
        super(pedido.getCliente());
        this.pedido = pedido;
    }

    @Override
    public BigDecimal getValor() {
        if (valor == null) {
            valor = pedido.getValor();
        }
        return valor;
    }

    @Override
    public void addItem(String item) {
        valor = null;
        pedido.addItem(item);
    }

    @Override
    public void removeItem(String item) {
        valor = null;
        pedido.removeItem(item);
    }
}

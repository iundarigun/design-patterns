package cat.ocanalias.designpatterns.proxy.solucao;

import cat.ocanalias.designpatterns.proxy.Pedido;

public class Principal {
    /**
     * Usando o proxy temos mais velocidade de resposta se não houver alterações nos itens
     *
     * https://refactoring.guru/design-patterns/proxy
     */
    public static void main(String[] args) {
        final Pedido pedido = new PedidoProxy(new Pedido("uri"));

        pedido.addItem("Item 1");
        pedido.addItem("Item 2");
        System.out.println("Valor total: " + pedido.getValor());

        // Outras ações

        System.out.println("Valor total: " + pedido.getValor());
    }
}

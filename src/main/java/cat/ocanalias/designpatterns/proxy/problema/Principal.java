package cat.ocanalias.designpatterns.proxy.problema;

import cat.ocanalias.designpatterns.proxy.Pedido;

public class Principal {
    /**
     * Se o getValor vai para uma API para consultar os preços do items, pode demorar a consulta.
     * Se não houver mudança na quantidade de itens, nem faz sentido ir de novo na API
     */
    public static void main(String[] args) {
        final Pedido pedido = new Pedido("uri");
        pedido.addItem("Item 1");
        pedido.addItem("Item 2");
        System.out.println("Valor total: " + pedido.getValor());

        // Outras ações

        System.out.println("Valor total: " + pedido.getValor());
    }
}

package cat.ocanalias.designpatterns.adapter.solucao;

import cat.ocanalias.designpatterns.adapter.Pedido;
import lombok.RequiredArgsConstructor;
import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class RegistrarPedidoApi {

    private final HttpAdapter httpAdapter;

    public void registrar(final Pedido pedido) {
        if (!pedido.getEstado().equals("FINALIZADO")) {
            throw new IllegalStateException("Estado invalido");
        }
        final Map<String, Object> map = new HashMap<>();
        map.put("cliente", pedido.getCliente());
        map.put("orcamento", pedido.getOrcamento());

        httpAdapter.post("http://my-api", map);
    }
}

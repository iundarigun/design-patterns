package cat.ocanalias.designpatterns.adapter.problema;

import cat.ocanalias.designpatterns.adapter.Pedido;
import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.net.URL;


public class RegistrarPedidoApi {

    public void registrar(final Pedido pedido) throws IOException {
        if (!pedido.getEstado().equals("FINALIZADO")) {
            throw new IllegalStateException("Estado invalido");
        }
        URL url = new URL("http://my-api");
        HttpClient httpClient = new HttpClient(url, "NO_PROXY", 200);
         // etc
    }
}

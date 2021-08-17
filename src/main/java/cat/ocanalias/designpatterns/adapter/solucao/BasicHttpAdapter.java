package cat.ocanalias.designpatterns.adapter.solucao;

import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.net.URL;
import java.util.Map;

public class BasicHttpAdapter implements HttpAdapter {
    @Override
    public void post(String url, Map<String, Object> data) {
        try {
            URL uri = new URL("http://my-api");
            HttpClient httpClient = new HttpClient(uri, "NO_PROXY", 200);
        } catch (IOException e) {
            throw new RuntimeException("alguma coisa errada não está certa");
        }
        // etc
    }
}

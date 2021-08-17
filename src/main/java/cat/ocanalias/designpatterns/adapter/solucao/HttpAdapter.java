package cat.ocanalias.designpatterns.adapter.solucao;

import java.util.Map;

public interface HttpAdapter {
    void post(String url, Map<String, Object> data);
}

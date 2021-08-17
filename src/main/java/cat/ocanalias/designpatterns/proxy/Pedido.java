package cat.ocanalias.designpatterns.proxy;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.SneakyThrows;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class Pedido {
    @Getter
    private final String cliente;
    private final List<String> items = new ArrayList<>();

    @SneakyThrows
    public BigDecimal getValor() {
        // Imagine uma chamada externa para cada item
        Thread.sleep(2000L);
        return new BigDecimal("200");
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }
}

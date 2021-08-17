package cat.ocanalias.designpatterns.adapter;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class Pedido {
    private final String cliente;
    private final LocalDateTime data;
    private final BigDecimal orcamento;
    @Setter
    private String estado = "CARRINHO";
}

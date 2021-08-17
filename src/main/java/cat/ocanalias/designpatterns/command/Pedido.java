package cat.ocanalias.designpatterns.command;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class Pedido {
    private final String cliente;
    private final LocalDateTime data;
    private final BigDecimal orcamento;
}

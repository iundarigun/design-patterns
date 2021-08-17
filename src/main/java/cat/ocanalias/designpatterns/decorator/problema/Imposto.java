package cat.ocanalias.designpatterns.decorator.problema;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(BigDecimal valor);
}

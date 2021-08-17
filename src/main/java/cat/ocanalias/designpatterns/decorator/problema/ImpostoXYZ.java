package cat.ocanalias.designpatterns.decorator.problema;

import java.math.BigDecimal;

public class ImpostoXYZ implements Imposto {
    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return valor.multiply(new BigDecimal("0.05"));
    }
}

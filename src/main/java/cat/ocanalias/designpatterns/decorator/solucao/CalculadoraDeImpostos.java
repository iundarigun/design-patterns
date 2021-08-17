package cat.ocanalias.designpatterns.decorator.solucao;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(BigDecimal valor, Imposto imposto) {
        return imposto.calcular(valor);
    }
}

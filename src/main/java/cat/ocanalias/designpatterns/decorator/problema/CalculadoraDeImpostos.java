package cat.ocanalias.designpatterns.decorator.problema;

import cat.ocanalias.designpatterns.decorator.problema.Imposto;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(BigDecimal valor, Imposto imposto) {
        return imposto.calcular(valor);
    }
}

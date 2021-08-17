package cat.ocanalias.designpatterns.decorator.solucao;

import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
public abstract class Imposto {
    private final Imposto proximo;

    protected abstract BigDecimal realizarCalculoEspecifico(BigDecimal valor);

    public BigDecimal calcular(BigDecimal valor) {
        BigDecimal valorImposto = realizarCalculoEspecifico(valor);
        BigDecimal valorOutroImposto = BigDecimal.ZERO;
        if (proximo != null) {
            valorOutroImposto = proximo.realizarCalculoEspecifico(valor);
        }

        return valorImposto.add(valorOutroImposto);
    }

}

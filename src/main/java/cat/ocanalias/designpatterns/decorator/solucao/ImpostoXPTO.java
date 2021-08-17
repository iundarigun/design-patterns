package cat.ocanalias.designpatterns.decorator.solucao;


import java.math.BigDecimal;

public class ImpostoXPTO extends Imposto {
    public ImpostoXPTO(Imposto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal realizarCalculoEspecifico(BigDecimal valor) {
        return valor.multiply(new BigDecimal("0.1"));
    }
}

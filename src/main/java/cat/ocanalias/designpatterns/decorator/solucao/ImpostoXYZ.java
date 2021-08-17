package cat.ocanalias.designpatterns.decorator.solucao;


import java.math.BigDecimal;

public class ImpostoXYZ extends Imposto {

    public ImpostoXYZ(Imposto proximo) {
        super(proximo);
    }

    @Override
    protected BigDecimal realizarCalculoEspecifico(BigDecimal valor) {
        return valor.multiply(new BigDecimal("0.05"));
    }
}

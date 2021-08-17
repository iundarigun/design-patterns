package cat.ocanalias.designpatterns.decorator.solucao;

import java.math.BigDecimal;

public class Principal {
    /**
     * Agora conseguimos que os impostos sejam calculados de forma encadeada e decidindo em cada caso
     * quais são os impostos a calcular
     *
     * https://refactoring.guru/design-patterns/decorator
     */
    public static void main(String[] args) {
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        BigDecimal valor1 = calculadoraDeImpostos
                .calcular(new BigDecimal("200"), new ImpostoXPTO(new ImpostoXYZ(null)));
    }
}

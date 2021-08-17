package cat.ocanalias.designpatterns.decorator.problema;

import java.math.BigDecimal;

public class Principal {
    /**
     * O problema de esta abordagem é que precisamos aidiconar tantos valores como impostos queremos
     * calcular. Dependendo do gasto, pode precisar mais ou menos
     */
    public static void main(String[] args) {
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        BigDecimal valor1 = calculadoraDeImpostos.calcular(new BigDecimal("200"), new ImpostoXPTO());
        BigDecimal valor2 = calculadoraDeImpostos.calcular(new BigDecimal("200"), new ImpostoXYZ());
        BigDecimal imposto = valor1.add(valor2);
    }
}

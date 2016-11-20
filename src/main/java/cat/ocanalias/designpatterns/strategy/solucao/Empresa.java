package cat.ocanalias.designpatterns.strategy.solucao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Empresa implements Cliente{
    @Override
    public Double calcularMensalidade() {
        log.info("Calculamos o valor da mensalidade para a empresa");
        return new Double(10);
    }
}

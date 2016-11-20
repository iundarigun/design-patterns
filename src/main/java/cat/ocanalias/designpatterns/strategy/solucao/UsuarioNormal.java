package cat.ocanalias.designpatterns.strategy.solucao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UsuarioNormal implements Cliente{
    @Override
    public Double calcularMensalidade() {
        log.info("Calculamos o valor da mensalidade para usuario normal");
        return new Double(20);
    }
}

package cat.ocanalias.designpatterns.observer.solucao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealizarMovimentacao implements Obervador<Transacao> {
    @Override
    public void acao(Transacao item) {
        log.info("Realizamos a movimentação financeiras");
    }
}

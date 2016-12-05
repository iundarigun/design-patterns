package cat.ocanalias.designpatterns.observer.solucao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NotificarSMS implements Obervador<Transacao> {
    
    @Override
    public void acao(Transacao item) {
        log.info("notificar por SMS recebeu uma quantidade x: {}", item.getDestinatario().getEmail());
        log.info("notificar por SMS transferiu uma quantidade x: {}", item.getEmissor().getEmail());
    }
}

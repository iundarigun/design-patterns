package cat.ocanalias.designpatterns.observer.solucao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NotificarEmail implements Obervador<Transacao> {

    @Override
    public void acao(Transacao item) {
        log.info("notificar por email recebeu uma quantidade x: {}", item.getDestinatario().getEmail());
        log.info("notificar por email transferiu uma quantidade x: {}", item.getEmissor().getEmail());
    }
}

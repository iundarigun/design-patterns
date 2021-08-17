package cat.ocanalias.designpatterns.observer.solucao;

import cat.ocanalias.designpatterns.observer.Conta;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Data
@Slf4j
public class Transacao extends Observavel<Transacao> {

    private Conta emissor;
    private Conta destinatario;
    private String status;
    private BigDecimal valor;

    public Transacao() {
        adicionaObervador(new NotificarEmail());
        adicionaObervador(new NotificarSMS());
        adicionaObervador(new RealizarMovimentacao());
    }

    /**
     * Agora deixamos que o método notifica envie para os observadores
     * registrados os dados para ele fazer a ação que precisar.
     * Na configuração, só precisaremos adicionar os observadoress
     *
     * https://refactoring.guru/design-patterns/observer
     */
    public void finalizarTransacao(){
       log.info("A transação foi confirmada");
       status = "Finalizada";
       // invocamos a notificação
       notifica(this);
    }
}

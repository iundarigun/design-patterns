package cat.ocanalias.designpatterns.observer.problema;

import cat.ocanalias.designpatterns.observer.Conta;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Data
@Slf4j
public class Transacao {

    private Conta emissor;
    private Conta destinatario;
    private String status;
    private BigDecimal valor;
    /**
     * Vamos supor que temos varias ações a serem realizadas quando uma transação é finalizada.
     * Por exemplo:
     * - Notificar o emissor
     * - Notificar o destinatário
     * - Efetuar a movimentação financeira
     * Para cada nova ação a ser realizada precisamos criar um if. E algumas podem mudar a logica, pois
     * os clientes reclamaram que querem poder configurar que notifição receber.  O que era para ser um código
     * simples termina sendo muito complicado. E vamos ter que mexer na classe transação, muito delicada, para
     * alterar o comportamento das ações a serem realizadas
     */
    public void finalizarTransacao(){
       log.info("A transação foi confirmada");
       // Realizamos a movimentação financeira
       realizarMovimentacao();
        // Notificar
        notificarEmail(emissor, false);
        notificarEmail(destinatario, true);
        // SMS
        notificarSMS(emissor);
        // etc...
    }

    private void notificarSMS(Conta usuario) {
        log.info("notificar emissor");
    }

    private void notificarEmail(Conta usuario, boolean destinatario) {
        if (destinatario) {
            log.info("notificar por email recebeu uma quantidade x: {}", usuario.getEmail());
        }else{
            log.info("notificar por email transferiu uma quantidade x: {}", usuario.getEmail());
        }
    }

    private void realizarMovimentacao() {
        log.info("realizamos movimentação");
    }
}

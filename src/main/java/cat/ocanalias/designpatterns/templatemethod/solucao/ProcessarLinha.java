package cat.ocanalias.designpatterns.templatemethod.solucao;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by uri on 18/11/16.
 */
@AllArgsConstructor
@Slf4j
public abstract class ProcessarLinha {
    private String linha ;

    /**
     * Na solução isolamos a implementacao em métodos que serão implementados pelos herderos
     */
    public void processar(){
        // Salvar a linha na tabela Linha
        salvarLinha();
        // Validar o tipo de linha
        salvarTipo();
        // Salvar a operacao
        salvarOperacao();
    }

    private void salvarLinha(){
        log.info("salvar no banco o objeto");
    }

    private void salvarOperacao() {
        log.info("salvar no banco o objeto operacao");
    }

    /**
     * Este método será implementado pelos tipos
     */
    protected abstract void salvarTipo();

}

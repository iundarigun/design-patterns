package cat.ocanalias.designpatterns.templatemethod.solucao;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by uri on 18/11/16.
 */
@Slf4j
public class ProcessarTipo02 extends  ProcessarLinha{

    public ProcessarTipo02(String linha) {
        super(linha);
    }

    @Override
    protected void salvarTipo() {
        log.info("salvar no banco o tipo 02");
    }
}

package cat.ocanalias.designpatterns.templatemethod.problema;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by uri on 18/11/16.
 */
@AllArgsConstructor
@Slf4j
public class ProcessarLinha {
    private String linha ;

    /**
     * O problema acontece quando temos algum processamento comum que tem alguma particularidade.
     * O caso apresentado poderia ser um tipo de operacao bancaria importada de um arquivo e precisa
     * registrar no banco de dados. Poderia acontecer de em função do tipo de linha (para por um exemplo
     * abstrato) temos que fazer uma parte especifica, que ensuja nossa classe e enche de ifs. Além do mais,
     * o dia que aparecer um novo tipo de linha o código vai ter mais um if e fica cada vez mais dificil
     * de manter.
     */
    public void processar(){
        // Salvar a linha na tabela Linha
        salvarLinha();
        // Validar o tipo de linha
        if (linha.startsWith("01")){
            salvarTipo01();
        }else if (linha.startsWith("02")){
            salvarTipo02();
        }
        // Salvar a operacao
        salvarOperacao();
    }

    private void salvarLinha(){
        log.info("salvar no banco o objeto");
    }

    private void salvarTipo01() {
        log.info("salvar no banco o objeto tipo 01");
    }
    private void salvarTipo02() {
        log.info("salvar no banco o objeto tipo 02");
    }

    private void salvarOperacao() {
        log.info("salvar no banco o objeto operacao");
    }

}

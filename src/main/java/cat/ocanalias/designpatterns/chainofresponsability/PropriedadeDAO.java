package cat.ocanalias.designpatterns.chainofresponsability;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PropriedadeDAO {

    public String getPropriedadePorNome(String nome){
        log.info("Recuperar do banco as propreidades");
        return "propriedade";
    }

    public void salvarPropriedade(String propriedade, String valor){
        log.info("salvar no banco as propreidades");

    }
}

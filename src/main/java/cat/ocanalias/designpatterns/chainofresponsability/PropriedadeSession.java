package cat.ocanalias.designpatterns.chainofresponsability;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PropriedadeSession {

    public String getPropriedadePorNome(String nome){
        log.info("Recuperar da session");
        return "propriedade";
    }

    public void salvarPropriedade(String propriedade, String valor){
        log.info("salvar na session as propreidades");

    }
}

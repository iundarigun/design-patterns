package cat.ocanalias.designpatterns.chainofresponsability;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PropriedadeArquivo {

    public String getPropriedadePorNome(String nome){
        log.info("Recuperar do arquivo");
        return "propriedade";
    }

}

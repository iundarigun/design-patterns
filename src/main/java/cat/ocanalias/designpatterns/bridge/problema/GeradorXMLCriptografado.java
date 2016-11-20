package cat.ocanalias.designpatterns.bridge.problema;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GeradorXMLCriptografado extends GeradorXML{

    @Override
    protected byte[] processar(String conteudo) {
        log.info("Criptografamos o arquivo");
        return conteudo.getBytes();
    }
}

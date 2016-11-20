package cat.ocanalias.designpatterns.bridge.problema;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GeradorXMLCompactado extends GeradorXML{
    @Override
    protected byte[] processar(String conteudo) {
        log.info("Compactamos o arquivo");
        return conteudo.getBytes();
    }
}

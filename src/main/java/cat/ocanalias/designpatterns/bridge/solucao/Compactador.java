package cat.ocanalias.designpatterns.bridge.solucao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Compactador implements Processador{
    @Override
    public byte[] processar(String conteudo) {
        log.info("Compactamos o arquivo");
        return conteudo.getBytes();
    }
}

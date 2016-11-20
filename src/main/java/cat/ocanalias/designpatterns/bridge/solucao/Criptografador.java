package cat.ocanalias.designpatterns.bridge.solucao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Criptografador implements Processador{
    @Override
    public byte[] processar(String conteudo) {
        log.info("Criptografamos o arquivo");
        return conteudo.getBytes();
    }
}

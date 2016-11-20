package cat.ocanalias.designpatterns.bridge.solucao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GeradorProperties extends GeradorArquivo {

    public GeradorProperties(Processador processador) {
        super(processador);
    }

    @Override
    protected String gerarConteudo() {
        return "conteudo=conteudo do arquivo\n";
    }
}

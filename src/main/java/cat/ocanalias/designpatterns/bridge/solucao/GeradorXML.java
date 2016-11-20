package cat.ocanalias.designpatterns.bridge.solucao;


public class GeradorXML extends GeradorArquivo {
    public GeradorXML(Processador processador) {
        super(processador);
    }

    @Override
    protected String gerarConteudo() {
        return "<xml><conteudo>gerando o conteudo</conteudo></xml>";
    }
}

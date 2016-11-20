package cat.ocanalias.designpatterns.bridge.problema;

public abstract class GeradorXML extends GeradorArquivo{
    @Override
    protected String gerarConteudo() {
        return "<xml><conteudo>gerando o conteudo</conteudo></xml>";
    }
}

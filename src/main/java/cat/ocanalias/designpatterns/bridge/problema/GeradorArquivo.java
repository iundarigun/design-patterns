package cat.ocanalias.designpatterns.bridge.problema;

/**
 * No gerador de arquivo, implementamos uma herança com template method para resolver as diferentes
 * implementações da geração. Porém, como tanto na geração de arquivo properties como na geração de
 * XML tem algum caso que vamos compactar o arquivo, o resultado é a duplicidade de código.
 * O problema acontece por conta da limitação da herança.
 */
public abstract class GeradorArquivo {

    public byte[] gerarArquivo(){
        String conteudo = gerarConteudo();
        return processar(conteudo);
    }

    protected abstract byte[] processar(String conteudo);

    protected abstract String gerarConteudo();
}

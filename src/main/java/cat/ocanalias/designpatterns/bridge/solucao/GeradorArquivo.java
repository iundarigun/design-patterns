package cat.ocanalias.designpatterns.bridge.solucao;

public abstract class GeradorArquivo {
    private Processador processador;

    public GeradorArquivo(Processador processador){
        this.processador = processador;
    }

    /**
     * Resolvemos o problema da duplicidade combinando o templatemethod e o strategy, criando uma interface
     * para o processamento e deixando na herança a geração do conteúdo com o uso dos hooks methods.
     * Caso não houver pos processamento, podemos usar o padrão nullObject para retornar só o array de bytes.
     */
    public byte[] gerarArquivo(){
        String conteudo = gerarConteudo();
        return processador.processar(conteudo);
    }

    protected abstract String gerarConteudo();
}

package cat.ocanalias.designpatterns.composite.solucao;

public class TrechoComposto implements TrechoAereo{
    private TrechoAereo origem;
    private TrechoAereo destino;
    private Double taxaConexao;

    public TrechoComposto(TrechoAereo origem, TrechoAereo destino, Double taxaConexao) {
        this.origem = origem;
        this.destino = destino;
        this.taxaConexao = taxaConexao;
    }

    @Override
    public String getOrigem() {
        return origem.getOrigem();
    }

    @Override
    public String getDestino() {
        return destino.getDestino();
    }

    @Override
    public Double getPreco() {
        return origem.getPreco() + destino.getPreco() + taxaConexao;
    }
}

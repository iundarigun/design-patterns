package cat.ocanalias.designpatterns.chainofresponsability.solucao;

import cat.ocanalias.designpatterns.chainofresponsability.PropriedadeArquivo;
import cat.ocanalias.designpatterns.chainofresponsability.PropriedadeDAO;

public class RecuperarPropriedadeArquivo extends RecuperarPropriedade {

    PropriedadeArquivo arquivo = new PropriedadeArquivo();

    public RecuperarPropriedadeArquivo(RecuperarPropriedade seguinte) {
        super(seguinte);
    }

    @Override
    protected String recuperarPropriedade(String propriedade) {
        return arquivo.getPropriedadePorNome(propriedade);
    }

}

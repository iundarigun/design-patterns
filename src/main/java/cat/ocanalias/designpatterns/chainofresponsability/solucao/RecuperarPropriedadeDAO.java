package cat.ocanalias.designpatterns.chainofresponsability.solucao;

import cat.ocanalias.designpatterns.chainofresponsability.PropriedadeDAO;
import cat.ocanalias.designpatterns.chainofresponsability.PropriedadeSession;

public class RecuperarPropriedadeDAO extends RecuperarPropriedade {

    PropriedadeDAO dao = new PropriedadeDAO();

    public RecuperarPropriedadeDAO(RecuperarPropriedade seguinte) {
        super(seguinte);
    }

    @Override
    protected String recuperarPropriedade(String propriedade) {
        return dao.getPropriedadePorNome(propriedade);
    }

    protected String chamaSeguinte(String propriedade) {
        String valor = super.chamaSeguinte(propriedade);
        dao.salvarPropriedade(propriedade,valor);
        return valor;
    }
}

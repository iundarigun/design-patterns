package cat.ocanalias.designpatterns.chainofresponsability.solucao;

import cat.ocanalias.designpatterns.chainofresponsability.PropriedadeSession;

public class RecuperarPropriedadeSession extends RecuperarPropriedade {

    PropriedadeSession session = new PropriedadeSession();

    public RecuperarPropriedadeSession(RecuperarPropriedade seguinte) {
        super(seguinte);
    }

    @Override
    protected String recuperarPropriedade(String propriedade) {
        return session.getPropriedadePorNome(propriedade);
    }

    protected String chamaSeguinte(String propriedade) {
        String valor = super.chamaSeguinte(propriedade);
        session.salvarPropriedade(propriedade,valor);
        return valor;
    }
}

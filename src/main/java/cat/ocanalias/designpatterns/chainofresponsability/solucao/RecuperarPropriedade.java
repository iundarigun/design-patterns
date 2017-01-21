package cat.ocanalias.designpatterns.chainofresponsability.solucao;

import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;

@AllArgsConstructor
public abstract class RecuperarPropriedade {
    private RecuperarPropriedade seguinte;

    public String recuperar(String propriedade){
        String valor = recuperarPropriedade(propriedade);
        if (StringUtils.isBlank(valor)){
            return chamaSeguinte(propriedade);
        }
        return valor;
    }

    protected String chamaSeguinte(String propriedade) {
        if (seguinte == null){
            throw new IllegalArgumentException();
        }
        return seguinte.recuperar(propriedade);
    }

    protected abstract String recuperarPropriedade(String propriedade);
}

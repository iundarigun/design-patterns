package cat.ocanalias.designpatterns.chainofresponsability.problema;

import cat.ocanalias.designpatterns.chainofresponsability.PropriedadeArquivo;
import cat.ocanalias.designpatterns.chainofresponsability.PropriedadeDAO;
import cat.ocanalias.designpatterns.chainofresponsability.PropriedadeSession;
import org.apache.commons.lang3.StringUtils;

public class Principal {
    /**
     * Imagine que exista uma serie de passos a serem realizados em cadeia. Se enxemos o código de
     * confidicionais e returns vai dificultar a manutenção e a alteração dessa cadeia.
     * Imagina o caso de ter que recuperar de uma propriedade. Ela pode estar na sessão do usuário,
     * no banco ou no arquivo, procurando nessa ordem. E se amanhã incluimos um cache, complica muito
     * a manutenção
     */
    public String recuperarPropriedade(String propriedade){
        // Procurar na session
        PropriedadeSession session = new PropriedadeSession();
        String valor = session.getPropriedadePorNome(propriedade);
        if (StringUtils.isNotBlank(valor)){
            return valor;
        }
        // Procurar no dao
        PropriedadeDAO dao = new PropriedadeDAO();
        valor = dao.getPropriedadePorNome(propriedade);
        if (StringUtils.isNotBlank(valor)){
            session.salvarPropriedade(propriedade, valor);
            return valor;
        }
        // Procurar nas properties
        PropriedadeArquivo arquivo= new PropriedadeArquivo();
        valor = arquivo.getPropriedadePorNome(propriedade);
        if (StringUtils.isNotBlank(valor)){
            dao.salvarPropriedade(propriedade, valor);
            return valor;
        }
        throw new IllegalArgumentException();
    }
}

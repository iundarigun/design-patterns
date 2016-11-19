package cat.ocanalias.designpatterns.factorymethod.solucao;

import cat.ocanalias.designpatterns.factorymethod.DAO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Servico<E> {
    /**
     * Deixando o método abstrato, delegamos a criação do dao ao serviço que extenda
     * esta classe
     */
    protected abstract DAO<E> getDao();

    public void gerarArquivo(Object id){
        E entidade = getDao().recuperarPorId(id);
        log.info("Salvando o ojeto no arquivo: " + entidade.toString());
    }
}

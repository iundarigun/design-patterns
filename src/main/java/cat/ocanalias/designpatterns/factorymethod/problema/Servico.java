package cat.ocanalias.designpatterns.factorymethod.problema;

import cat.ocanalias.designpatterns.factorymethod.ClienteEntidade;
import cat.ocanalias.designpatterns.factorymethod.DAO;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by uri on 18/11/16.
 */
@Slf4j
public class Servico<E> {
    /**
     * Nosso problema é na hora de criar o objeto da classe generica, precisamos especificar o DAO
     * Poderiamos passar o dao no construtor, porém caso tivessemos métodos especificos de cada
     * tipo de entidade (por exemplo calcular desconto, verifica edade, etc), deveriamos usar dois
     * serviços diferentes en função do método que precisassemos
     */
    private DAO<E> dao;

    public void gerarArquivo(Object id){
        E entidade = dao.recuperarPorId(id);
        log.info("Salvando o ojeto no arquivo: " + entidade.toString());
    }
}

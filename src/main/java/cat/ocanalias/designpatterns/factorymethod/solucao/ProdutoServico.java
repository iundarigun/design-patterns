package cat.ocanalias.designpatterns.factorymethod.solucao;

import cat.ocanalias.designpatterns.factorymethod.DAO;
import cat.ocanalias.designpatterns.factorymethod.ProdutoDAO;
import cat.ocanalias.designpatterns.factorymethod.ProdutoEntidade;

public class ProdutoServico extends Servico<ProdutoEntidade> {
    private DAO<ProdutoEntidade> dao;

    @Override
    protected DAO<ProdutoEntidade> getDao() {
        if (dao == null){
            dao = new ProdutoDAO();
        }
        return dao;
    }

    // Outros métodos especificos desse serviço
}

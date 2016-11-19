package cat.ocanalias.designpatterns.factorymethod.solucao;

import cat.ocanalias.designpatterns.factorymethod.*;

public class ClienteServico extends Servico<ClienteEntidade> {
    private DAO<ClienteEntidade> dao;

    @Override
    protected DAO<ClienteEntidade> getDao() {
        if (dao == null){
            dao = new ClienteDAO();
        }
        return dao;
    }

    // Outros métodos especificos desse serviço
}

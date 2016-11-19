package cat.ocanalias.designpatterns.factorymethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProdutoDAO implements DAO<ProdutoEntidade> {
    @Override
    public ProdutoEntidade recuperarPorId(Object id) {
        log.info("Recuperar o objeto do banco");
        return new ProdutoEntidade(new Long(id.toString()),"nome", "categoria", 10.50);
    }
}

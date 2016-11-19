package cat.ocanalias.designpatterns.factorymethod;

import lombok.extern.slf4j.Slf4j;

import java.util.Calendar;

@Slf4j
public class ClienteDAO implements DAO<ClienteEntidade> {
    @Override
    public ClienteEntidade recuperarPorId(Object id) {
        log.info("Recuperar o objeto do banco");
        return new ClienteEntidade(new Long(id.toString()),"nome", Calendar.getInstance(), "12345678912");
    }
}

package cat.ocanalias.designpatterns.factorymethod;

/**
 * Created by uri on 18/11/16.
 */
public interface DAO<E> {
    public E recuperarPorId(Object id);
    // TODO Outros métodos úteis
}

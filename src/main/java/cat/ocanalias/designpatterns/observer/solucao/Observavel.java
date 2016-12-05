package cat.ocanalias.designpatterns.observer.solucao;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Data
@Slf4j
public abstract class Observavel<T> {
    private List<Obervador<T>> observadorList = new ArrayList<>();

    public void adicionaObervador(Obervador<T> observador) {
        observadorList.add(observador);
    }

    public void removeObervador(Obervador<T> observador) {
        observadorList.remove(observador);
    }

    public void notifica(T item) {
        for (Obervador<T> observador : observadorList) {
            try {
                observador.acao(item);
            } catch (Exception e) {
                log.error("Garantimos que um erro num observador não da problemas nos outros", e);
            }
        }
    }
}

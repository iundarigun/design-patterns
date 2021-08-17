package cat.ocanalias.designpatterns.composite.solucao;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Principal {
    /**
     * Com o composite é mais facil criar os trechos e calcular o preço. E ainda colocamos de forma
     * simples uma taxa de conexão.
     *
     * https://refactoring.guru/design-patterns/composite
     */
    public static void main(String... args) {
        TrechoAereo trechoAereo= new TrechoComposto(new TrechoSimples("São Paulo", "Brasilia", 350.00),
                new TrechoComposto(new TrechoSimples("Brasilia", "Recife", 450.00)
                        , new TrechoSimples("Recife", "Fernando de Noronha", 850.00), 100.00), 100.00);
        log.info("O preço é {}", trechoAereo.getPreco());
    }
}

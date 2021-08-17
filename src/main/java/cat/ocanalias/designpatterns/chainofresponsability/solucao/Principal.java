package cat.ocanalias.designpatterns.chainofresponsability.solucao;

public class Principal {

    RecuperarPropriedade recuperarPropriedade = new RecuperarPropriedadeSession(
            new RecuperarPropriedadeDAO(
                    new RecuperarPropriedadeArquivo(null)));

    /**
     * Criamos mais classes e até parece pior. Mas só uma linha para invocar e em cada classe só
     * temos a responsabilidade própria dele.
     *
     * https://refactoring.guru/design-patterns/chain-of-responsibility
     */
    public String recuperarPropriedade(String propriedade) {
        return recuperarPropriedade.recuperarPropriedade(propriedade);
    }
}

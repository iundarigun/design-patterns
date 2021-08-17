package cat.ocanalias.designpatterns.state.solucao;

public class Pacote {
    private EstadoEnum estado;

    /**
     * O state usa o strategy para resolver um problema mais especifico ao estado de um objeto, deixando
     * a lógica dentro do estado. Não precisa ser um enum. Muito parecido ao Strategy
     *
     * https://refactoring.guru/design-patterns/state
     */
    public String getNotificacao(){
        return estado.getNotificacao();
    }
}

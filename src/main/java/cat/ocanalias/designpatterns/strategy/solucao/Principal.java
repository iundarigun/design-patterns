package cat.ocanalias.designpatterns.strategy.solucao;

public class Principal {
    /**
     * O strategy deixa a implementação do calculo para a implementação da interface
     * Desse jeito só temos que nos preocupar de que tipo de cliente se trata e classe especifica
     * se diponibiliza para realizar o cálculo
     */
    public static void main(String... args){
        Cliente cliente = getTipoCliente(args[0]);
        Double valor = cliente.calcularMensalidade();
    }

    public static Cliente getTipoCliente(String tipoCliente){
        // O Cliente é resolvido por algum outro padrão. Pode ser factory por exemplo.
        return null;
    }
}

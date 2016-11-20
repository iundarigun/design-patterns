package cat.ocanalias.designpatterns.strategy.problema;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Principal {

    /**
     * Imagina que temos que calcular o preço da mensalidade em função do tipo de cliente.
     * O cliente pode ser empresa, pode ser usuário normal e pode ser usuário premium. Nesse caso,
     * precisamos calcular o valor em função das variaveis de cada tipo de usuário, o que implica vários ifs
     * deixando o código sujo. Quando entrar mais um tipo de cliente (por exemplo governo), precisamos
     * acrescentar mais um if e mais uma lógica especifica, deixando o código muito dificil
     */
    public static void main(String... args) {
        Double valor = null;
        if (args[0] == "EMPRESA") {
            valor = calcularMensalidadeEmpresa();
        } else if (args[0] == "NORMAL") {
            valor = calcularMensalidadeUsuarioNormal();
        } else if (args[0] == "PREMIUM") {
            valor = calcularMensalidadeUsuarioPremium();
        } else if (args[0] == "GOVERNO") {
            valor = calcularMensalidadeGoverno();
        }
    }

    private static Double calcularMensalidadeEmpresa() {
        log.info("Calculamos o valor da mensalidade para a empresa");
        return new Double(10);
    }

    private static Double calcularMensalidadeUsuarioNormal() {
        log.info("Calculamos o valor da mensalidade para usuário normal");
        return new Double(20);
    }

    private static Double calcularMensalidadeUsuarioPremium() {
        log.info("Calculamos o valor da mensalidade para usuário premium");
        return new Double(15);
    }

    private static Double calcularMensalidadeGoverno() {
        log.info("Calculamos o valor da mensalidade para o governo");
        return new Double(5);
    }
}

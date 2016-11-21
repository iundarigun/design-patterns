package cat.ocanalias.designpatterns.state.problema;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Pacote {
    private String estado;

    /**
     * O problema acontece quando as ações a realizar dependem do estado de um objeto. Nesse caso,
     * só temos uma ação vinculada ao estado, mas poderiamos ter varias, complicando a lógica de
     * nosso objeto
     */
    public String getNotificacao(){
        if ("INICIAL".equals(estado)){
            return "O pacote ainda não foi postado";
        }else if ("POSTADO".equals(estado)){
            return "O pacote já foi postado";
        }else if ("EM_TRANSITO".equals(estado)){
            return "O pacote saiu para o centro de distribuição";
        }else if ("SAIDA_DESTINO".equals(estado)){
            return "O pacote saiu para entrega";
        }else if ("ENTREGADO".equals(estado)){
            return "O pacote foi entregue";
        }
        return null;
    }

}

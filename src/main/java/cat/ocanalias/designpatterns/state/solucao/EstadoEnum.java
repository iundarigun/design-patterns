package cat.ocanalias.designpatterns.state.solucao;

public enum EstadoEnum {
    INICIAL {
        @Override
        public String getNotificacao() {
            return "O pacote ainda não foi postado";
        }
    },
    POSTADO {
        @Override
        public String getNotificacao() {
            return "O pacote já foi postado";
        }
    },
    EM_TRANSITO {
        @Override
        public String getNotificacao() {
            return "O pacote saiu para o centro de distribuição";
        }
    },
    SAIDA_DESTINO {
        @Override
        public String getNotificacao() {
            return "O pacote saiu para entrega";
        }
    },
    ENTREGADO {
        @Override
        public String getNotificacao() {
            return "O pacote foi entregue";
        }
    };

    public abstract String getNotificacao();
}

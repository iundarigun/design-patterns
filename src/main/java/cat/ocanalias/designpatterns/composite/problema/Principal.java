package cat.ocanalias.designpatterns.composite.problema;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Principal {
    /**
     * Precisamos calcular uma viagem. Porém, não existe voo direto e vamos ter que parar em outros aeroportos.
     * Cada parte da viagem é chamada de trecho.
     * Para calcular o preço de uma viagem por trecho , precisamos fazer um lista de trecho aereo e percorrer ela
     * para obter o preço. Isso deixa a operação um pouco manual e complicada.
     */
    public static void main(String... args) {
        List<TrechoAereo> viagem = new ArrayList<>();
        viagem.add(new TrechoAereo("São Paulo", "Brasilia", 350.00));
        viagem.add(new TrechoAereo("Brasilia", "Recife", 450.00));
        viagem.add(new TrechoAereo("Recife", "Fernando de Noronha", 850.00));

        Double preco = 0.00;
        // Calcular o preço
        for (TrechoAereo trechoAereo:viagem){
            preco += trechoAereo.getPreco();
        }
        log.info("O preço é {}", preco);
    }
}

package cat.ocanalias.designpatterns.composite.solucao;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TrechoSimples implements TrechoAereo{
    private String origem;
    private String destino;
    private Double preco;
}

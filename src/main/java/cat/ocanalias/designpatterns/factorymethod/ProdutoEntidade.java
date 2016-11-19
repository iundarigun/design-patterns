package cat.ocanalias.designpatterns.factorymethod;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProdutoEntidade {
    private Long id;
    private String nome;
    private String categoria;
    private Double preco;
}

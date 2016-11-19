package cat.ocanalias.designpatterns.factorymethod;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Calendar;

@Data
@AllArgsConstructor
public class ClienteEntidade {
    private Long id;
    private String nome;
    private Calendar dataNascimento;
    private String documento;
}

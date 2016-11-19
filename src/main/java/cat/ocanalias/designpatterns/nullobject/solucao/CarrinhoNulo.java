package cat.ocanalias.designpatterns.nullobject.solucao;

import cat.ocanalias.designpatterns.nullobject.Carrinho;

/**
 * Created by uri on 18/11/16.
 */
public class CarrinhoNulo extends Carrinho{

    public CarrinhoNulo(){
        this(0.0, 0.0);
    }

    public CarrinhoNulo(Double valor, Double tamanho) {
        super(valor, tamanho);
    }
}

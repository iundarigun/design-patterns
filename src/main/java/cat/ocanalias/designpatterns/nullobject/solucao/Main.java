package cat.ocanalias.designpatterns.nullobject.solucao;

import cat.ocanalias.designpatterns.nullobject.Carrinho;

/**
 * Created by uri on 18/11/16.
 */
public class Main {

    /**
     * Vamos supor que temos uma aplicaçao de compra e temos um carrinho
     * Precisamos pegar o carrinho da request. Agora o processo de criar o carrinho
     * vai voltar um objeto com os valores predefinidos
     * @param args
     */
    public static void main(String... args){
        Carrinho carrinho = criarCarrinhoDesdeRequest(args);
        System.out.println("O valor do carrinho é " + carrinho.getValor());
        System.out.println("O valor do tamanho é " + carrinho.getTamanho());
    }

    private static Carrinho criarCarrinhoDesdeRequest(String...args){
        if (args.length>0){
            return new Carrinho(new Double(args.length),new Double(args.length));
        }
        return new CarrinhoNulo();
    }
}

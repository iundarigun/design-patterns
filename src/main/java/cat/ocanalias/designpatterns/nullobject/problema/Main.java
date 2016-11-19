package cat.ocanalias.designpatterns.nullobject.problema;

import cat.ocanalias.designpatterns.nullobject.Carrinho;

/**
 * Created by uri on 18/11/16.
 */
public class Main {

    /**
     * Vamos supor que temos uma aplicaçao de compra e temos um carrinho
     * Precisamos pegar o carrinho da request. O problema acontece quando
     * na request nao tem carrinho e temos que encher o código de ifs
     *
     * @param args
     */
    public static void main(String... args){
        Carrinho carrinho = criarCarrinhoDesdeRequest(args);
        if (carrinho == null){
            System.out.println("O valor do carrinho é " + 0);
            System.out.println("O valor do tamanho é " + 0);
        }else{
            System.out.println("O valor do carrinho é " + carrinho.getValor());
            System.out.println("O valor do tamanho é " + carrinho.getTamanho());
        }
    }

    private static Carrinho criarCarrinhoDesdeRequest(String...args){
        if (args.length>0){
            return new Carrinho(new Double(args.length),new Double(args.length));
        }
        return null;
    }
}

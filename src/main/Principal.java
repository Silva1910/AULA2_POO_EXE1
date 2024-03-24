package main;

import model.ItemPedido;
import model.Pedido;
import model.Produto;

public class Principal {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setCodigo(1);
        p1.setValor(10);

        Produto p2 = new Produto();
        p2.setCodigo(2);
        p2.setValor(15);

        ItemPedido item1 = new ItemPedido();
        item1.setQuantidade(3);
        item1.setProduto(p1);

        ItemPedido item2 = new ItemPedido();
        item2.setQuantidade(2);
        item2.setProduto(p2);

        Pedido pedido = new Pedido();
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        for (ItemPedido item : pedido.getItens()) {
            Produto produto = item.getProduto();
            System.out.println("Item: " + produto.getCodigo());
            System.out.println("Quantidade: " + item.getQuantidade());
            System.out.println("Valor unitário: " + produto.getValor());
            System.out.println("Valor total do item: " + item.getQuantidade() * produto.getValor());
            System.out.println("*************************************************************************");
        }

        // Exibindo o valor total do pedido
        try {
            System.out.println("Valor total do pedido: " + pedido.calcularValorTotal());
        } catch (Exception e) {
            System.out.println("Erro ao calcular valor total do pedido: " + e.getMessage());
        }
    }
}


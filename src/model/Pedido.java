package model;

import java.util.HashSet;
import java.util.Set;

public class Pedido {
    private int numeroNota;
    private Set<ItemPedido> itens;

    public Pedido() {
        itens = new HashSet<>();
    }

    public int getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }

    public Set<ItemPedido> getItens() {
        return itens;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getProduto().getValor() * item.getQuantidade();
        }
        return total;
    }
}

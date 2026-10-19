package edados.lista;

import java.util.Objects;

public class ItemCompra {
    private String nome;
    private int quantidade;

    public ItemCompra(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return quantidade + "x " + nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemCompra that = (ItemCompra) o;
        return Objects.equals(nome, that.nome);
    }
}
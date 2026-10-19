package edados.lista;

import java.util.Objects;

public class Convidado {
    private String nome;
    private String cpf;

    public Convidado(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return Objects.equals(cpf, convidado.cpf); // Busca pelo CPF
    }
}
package edados.lista;

import java.util.Objects;

public class Filme {
    private String titulo;
    private String genero;
    private int anoLancamento;

    public Filme(String titulo, String genero, int anoLancamento) {
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return titulo + " (" + anoLancamento + ") - " + genero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return Objects.equals(titulo, filme.titulo);
    }
}
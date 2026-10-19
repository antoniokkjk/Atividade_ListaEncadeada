package edados.lista;

public class ListaEncadeada<T> {
    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;
    private final int NAO__ENCONTRADO = -1;

    public void adiciona(T elemento) {
        No<T> celula = new No<>(elemento);

        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        if(this.tamanho == 0) {
            return "[]";
        }

        No<T> atual = this.inicio;
        sb.append(atual.getElemento()).append(",");

        while(atual.getProximo() != null) {
            atual = atual.getProximo();
            sb.append(atual.getElemento());
            if(atual.getProximo() != null) {
                sb.append(",");
            }
        }

        sb.append("]");
        return sb.toString();
    }

    public void limpa() {
        for (No<T> atual = this.inicio; atual != null;) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public int busca(T elemento) {
        No<T> noAtual = this.inicio;
        int pos = 0;

        while(noAtual != null) {
            if(noAtual.getElemento().equals(elemento)) {
                return pos;
            }
            pos++;
            noAtual = noAtual.getProximo();
        }
        return NAO__ENCONTRADO;
    }

    public T buscaPorPosicao(int posicao) {
        return this.buscaPorNo(posicao).getElemento();
    }

    private No<T> buscaPorNo(int posicao) {
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posicao invalida");
        }

        No<T> noAtual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProximo();
        }
        return noAtual;
    }

    public void adicionaInicio(T elemento) {
        if(this.tamanho == 0) {
            No<T> novoNo = new No<>(elemento);
            this.inicio = novoNo;
            this.ultimo = novoNo;
        } else {
            No<T> novoNo = new No<>(elemento);
            novoNo.setProximo(this.inicio);
            this.inicio = novoNo;
        }
        this.tamanho++;
    }

    public void adiciona(int posicao, T elemento) {
        if(posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException("Posicao invalida");
        }
        if(posicao == 0) {
            this.adicionaInicio(elemento);
        } else if (posicao == tamanho) {
            this.adiciona(elemento);
        } else {
            No<T> noAnterior = this.buscaPorNo(posicao - 1);
            No<T> proximoNo = noAnterior.getProximo();
            No<T> novoNo = new No<>(elemento, proximoNo);

            noAnterior.setProximo(novoNo);
            this.tamanho++;
        }
    }

    // --- MÉTODOS DE REMOÇÃO ADICIONADOS AQUI ---

    public T removeInicio() {
        if (this.tamanho == 0) {
            throw new RuntimeException("A lista está vazia.");
        }

        T elementoRemovido = this.inicio.getElemento();
        this.inicio = this.inicio.getProximo();
        this.tamanho--;

        if (this.tamanho == 0) {
            this.ultimo = null;
        }

        return elementoRemovido;
    }

    public T removeFinal() {
        if (this.tamanho == 0) {
            throw new RuntimeException("A lista está vazia.");
        }
        if (this.tamanho == 1) {
            return this.removeInicio();
        }

        No<T> penultimoNo = this.buscaPorNo(this.tamanho - 2);
        T elementoRemovido = penultimoNo.getProximo().getElemento();

        penultimoNo.setProximo(null);
        this.ultimo = penultimoNo;
        this.tamanho--;

        return elementoRemovido;
    }

    public T remove(int posicao) {
        if (posicao < 0 || posicao >= this.tamanho) {
            throw new IllegalArgumentException("Posicao invalida");
        }

        if (posicao == 0) {
            return this.removeInicio();
        }
        if (posicao == this.tamanho - 1) {
            return this.removeFinal();
        }

        No<T> noAnterior = this.buscaPorNo(posicao - 1);
        No<T> noAtual = noAnterior.getProximo();
        No<T> proximoNo = noAtual.getProximo();

        noAnterior.setProximo(proximoNo);
        noAtual.setProximo(null);
        this.tamanho--;

        return noAtual.getElemento();
    }
}
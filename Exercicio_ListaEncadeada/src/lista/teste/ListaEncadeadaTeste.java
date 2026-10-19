package lista.teste;

import edados.lista.*;

public class ListaEncadeadaTeste {
  public static void main(String[] args) {
    exercicio1();
    // exercicio2();
    // exercicio3();
    // exercicio4();
    // exercicio5();
    // exercicio6();
    // exercicio7();
    // exercicio8();
    // exercicio9();
    // exercicio10();
  }

  public static void exercicio1() {
    System.out.println("--- Exercício 1: Lista de Chamada ---");
    ListaEncadeada<Aluno> lista = new ListaEncadeada<>();
    lista.adiciona(new Aluno("Ana", "111"));
    lista.adiciona(new Aluno("Bruno", "222"));
    lista.adiciona(new Aluno("Carlos", "333"));
    lista.adiciona(new Aluno("Daniel", "444"));
    lista.adiciona(new Aluno("Elisa", "555"));

    System.out.println("Todos os alunos: " + lista);
    System.out.println("Primeiro aluno: " + lista.buscaPorPosicao(0));
    System.out.println("Último aluno: " + lista.buscaPorPosicao(lista.getTamanho() - 1));
    System.out.println("Total de alunos: " + lista.getTamanho());
  }

  public static void exercicio2() {
    System.out.println("--- Exercício 2: Playlist ---");
    ListaEncadeada<Musica> lista = new ListaEncadeada<>();
    lista.adiciona(new Musica("Song A", "Art 1"));
    lista.adiciona(new Musica("Song B", "Art 2"));
    lista.adiciona(new Musica("Song C", "Art 3"));
    lista.adiciona(new Musica("Song D", "Art 4"));
    lista.adiciona(new Musica("Song E", "Art 5"));
    lista.adiciona(new Musica("Song F", "Art 6"));

    System.out.println("Playlist: " + lista);

    Musica buscada = new Musica("Song C", "Art 3");
    int pos = lista.busca(buscada);
    System.out.println("Música Song C está na lista? " + (pos != -1 ? "Sim, posição " + pos : "Não"));
    System.out.println("Total de músicas: " + lista.getTamanho());
  }

  public static void exercicio3() {
    System.out.println("--- Exercício 3: Lista de Compras ---");
    ListaEncadeada<ItemCompra> lista = new ListaEncadeada<>();
    lista.adiciona(new ItemCompra("Arroz", 2));
    lista.adiciona(new ItemCompra("Feijão", 1));
    lista.adiciona(new ItemCompra("Macarrão", 3));
    lista.adiciona(new ItemCompra("Carne", 1));
    lista.adiciona(new ItemCompra("Leite", 4));
    lista.adiciona(new ItemCompra("Ovos", 12));
    lista.adiciona(new ItemCompra("Pão", 5));

    System.out.println("Lista completa: " + lista);
    System.out.println("Item na posição 3: " + lista.buscaPorPosicao(3));

    int pos = lista.busca(new ItemCompra("Leite", 4));
    System.out.println("Leite foi adicionado? " + (pos != -1 ? "Sim" : "Não"));
    System.out.println("Total de itens: " + lista.getTamanho());
  }

  public static void exercicio4() {
    System.out.println("--- Exercício 4: Catálogo de Livros ---");
    ListaEncadeada<Livro> lista = new ListaEncadeada<>();
    lista.adiciona(new Livro("Livro A", "Autor A", 2000));
    lista.adiciona(new Livro("Livro B", "Autor B", 2001));
    lista.adiciona(new Livro("Livro C", "Autor C", 2002));
    lista.adiciona(new Livro("Livro D", "Autor D", 2003));
    lista.adiciona(new Livro("Livro E", "Autor E", 2004));

    System.out.println("Livros iniciais: " + lista);
    lista.adicionaInicio(new Livro("Livro Zero", "Autor Z", 1999));
    lista.adiciona(new Livro("Livro F", "Autor F", 2005)); // Final

    System.out.println("Primeiro livro: " + lista.buscaPorPosicao(0));
    System.out.println("Último livro: " + lista.buscaPorPosicao(lista.getTamanho() - 1));
  }

  public static void exercicio5() {
    System.out.println("--- Exercício 5: Lista de Tarefas ---");
    ListaEncadeada<Tarefa> lista = new ListaEncadeada<>();
    for (int i = 1; i <= 8; i++) {
      lista.adiciona(new Tarefa("Tarefa " + i, i));
    }

    System.out.println("Tarefas: " + lista);
    System.out.println("Tarefa 5 está na lista? " + (lista.busca(new Tarefa("Tarefa 5", 5)) != -1));
    System.out.println("Última tarefa: " + lista.buscaPorPosicao(lista.getTamanho() - 1));
    System.out.println("Quantidade total: " + lista.getTamanho());
  }

  public static void exercicio6() {
    System.out.println("--- Exercício 6: Lista de Convidados ---");
    ListaEncadeada<Convidado> lista = new ListaEncadeada<>();
    for (int i = 1; i <= 6; i++) {
      lista.adiciona(new Convidado("Convidado " + i, "CPF" + i));
    }

    lista.adicionaInicio(new Convidado("Convidado VIP", "CPF0"));
    lista.adiciona(3, new Convidado("Convidado Meio", "CPFM"));

    System.out.println("Lista completa: " + lista);
    System.out.println("Convidado VIP está cadastrado? " + (lista.busca(new Convidado("Convidado VIP", "CPF0")) != -1));
    System.out.println("Total de convidados: " + lista.getTamanho());
  }

  public static void exercicio7() {
    System.out.println("--- Exercício 7: Estoque ---");
    ListaEncadeada<Produto> lista = new ListaEncadeada<>();
    for (int i = 1; i <= 5; i++) {
      lista.adiciona(new Produto("Prod " + i, 10.0 * i, i));
    }

    System.out.println("Produtos: " + lista);
    System.out.println("Produto na posição 2: " + lista.buscaPorPosicao(2));
    lista.adiciona(1, new Produto("Prod Extra", 15.0, 10));

    System.out.println("Prod 3 existe? " + (lista.busca(new Produto("Prod 3", 30.0, 3)) != -1));
    System.out.println("Primeiro: " + lista.buscaPorPosicao(0) + " | Último: " + lista.buscaPorPosicao(lista.getTamanho() -1));
  }

  public static void exercicio8() {
    System.out.println("--- Exercício 8: Agenda de Contatos ---");
    ListaEncadeada<Contato> lista = new ListaEncadeada<>();
    for (int i = 1; i <= 6; i++) {
      lista.adiciona(new Contato("Contato " + i, "9999-000" + i));
    }
    System.out.println("Contatos iniciais: " + lista);

    lista.removeInicio();
    lista.removeFinal();

    System.out.println("Após remoções: " + lista);
    System.out.println("Contatos restantes: " + lista.getTamanho());
  }

  public static void exercicio9() {
    System.out.println("--- Exercício 9: Boletim de Notas ---");
    ListaEncadeada<Disciplina> lista = new ListaEncadeada<>();
    lista.adiciona(new Disciplina("Matemática", 8.5));
    lista.adiciona(new Disciplina("Português", 9.0));
    lista.adiciona(new Disciplina("História", 7.5));
    lista.adiciona(new Disciplina("Geografia", 8.0));
    lista.adiciona(new Disciplina("Ciências", 9.5));

    System.out.println("Boletim: " + lista);
    System.out.println("Disciplina na posição 2: " + lista.buscaPorPosicao(2));

    lista.remove(2); // Remove História
    System.out.println("História cadastrada? " + (lista.busca(new Disciplina("História", 7.5)) != -1));
    System.out.println("Registros restantes: " + lista.getTamanho());
  }

  public static void exercicio10() {
    System.out.println("--- Exercício 10: Catálogo de Filmes ---");
    ListaEncadeada<Filme> lista = new ListaEncadeada<>();
    lista.adiciona(new Filme("Matrix", "Ficção", 1999));
    lista.adiciona(new Filme("Gladiador", "Ação", 2000));
    lista.adiciona(new Filme("Shrek", "Animação", 2001));
    lista.adiciona(new Filme("Senhor dos Anéis", "Fantasia", 2001));
    lista.adiciona(new Filme("Avatar", "Ficção", 2009));

    System.out.println("Filmes: " + lista);
    lista.adiciona(2, new Filme("Duna", "Ficção", 2021));
    System.out.println("Shrek está cadastrado? " + (lista.busca(new Filme("Shrek", "Animação", 2001)) != -1));

    lista.remove(1);
    System.out.println("Após remoção da pos 1: " + lista);

    lista.limpa();
    System.out.println("Tamanho após limpar: " + lista.getTamanho());
  }
}
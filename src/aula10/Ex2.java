package aula10;

import utils.*;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Map<String, HashSet<Book>> books = new TreeMap<>();
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);

        while (continuar) {
            System.out.println("-=-=-=-MENU-=-=-=-");
            System.out.println("1 - Criar novo género");
            System.out.println("2 - Adicionar livro");
            System.out.println("3 - Imprimir todos os géneros e livros");
            System.out.println("4 - Imprimir um livro aleatório do género");
            System.out.println("5 - Remover um género");
            System.out.println("6 - Remover um livro dum género");
            System.out.println("7 - Editar um género");
            System.out.println("8 - Editar um livro dum género");
            System.out.println("0 - Sair");
            System.out.println("-=-=-=-=-=-=-=-");

            int opcao = UserInput.intInput("Opção? ");

            switch (opcao) {
                case 1: // criar novo genero
                    if (!books.isEmpty()) {
                        System.out.println("Géneros existentes: " + books.keySet());
                    }
                    String genero = UserInput.stringNVInput("Genero? ");
                    if (books.containsKey(genero)) {
                        System.out.println("Género já existe!");
                    } else {
                        books.put(genero, new HashSet<Book>());
                    }
                    break;

                case 2: // adicionar livro
                    if (books.isEmpty()) {
                        System.out.println("Não existem géneros!");
                        break;
                    }
                    System.out.println("Géneros existentes: " + books.keySet());
                    String genero2 = UserInput.stringNVInput("Genero? ");
                    if (books.containsKey(genero2)) {
                        String titulo = UserInput.stringNVInput("Título ");
                        String autor = UserInput.stringNVInput("Autor? ");
                        int ano = UserInput.intInput("Ano? ");
                        Book book = new Book(titulo, autor, ano);
                        books.get(genero2).add(book);
                        System.out.println("Livro adicionado: " + book);
                    } else {
                        System.out.println("Género não existe!");
                    }
                    break;

                case 3: // print todos os generos e livros
                    if (books.isEmpty()) {
                        System.out.println("Não existem géneros nem livros!");
                        break;
                    }
                    for (Map.Entry<String, HashSet<Book>> entry : books.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;

                case 4: // print livro random do genero
                    if (books.isEmpty()) {
                        System.out.println("Não existem géneros nem livros!");
                        break;
                    }
                    System.out.println("Géneros existentes: " + books.keySet());
                    String genero3 = UserInput.stringNVInput("Genero? ");
                    if (books.containsKey(genero3)) {
                        if (books.get(genero3).isEmpty()) {
                            System.out.println("Não existem livros neste género!");
                            break;
                        } else {
                            System.out.println(
                                    books.get(genero3).toArray()[new Random().nextInt(books.get(genero3).size())]);
                        }
                    } else {
                        System.out.println("Género não existe!");
                    }
                    break;

                case 5: // remover genero
                    if (books.isEmpty()) {
                        System.out.println("Não existem géneros!");
                        break;
                    }
                    System.out.println("Géneros existentes: " + books.keySet());
                    String genero4 = UserInput.stringNVInput("Genero? ");
                    if (books.containsKey(genero4)) {
                        books.remove(genero4);
                        System.out.println("Género removido!");
                    } else {
                        System.out.println("Género não existe!");
                    }
                    break;

                case 6: // remover livro dum genero
                    if (books.isEmpty()) {
                        System.out.println("Não existem géneros nem livros!");
                        break;
                    }
                    System.out.println("Géneros existentes: " + books.keySet());
                    String genero5 = UserInput.stringNVInput("Genero? ");
                    if (books.containsKey(genero5)) {
                        if (books.get(genero5).isEmpty()) {
                            System.out.println("Não existem livros neste género!");
                            break;
                        }
                        System.out.println("Livros existentes: " + books.get(genero5));
                        String nomelivro = UserInput.stringNVInput("Livro? ");
                        Book book = searchBookByName(nomelivro, books.get(genero5));
                        if (book != null) {
                            if (books.get(genero5).contains(book)) {
                                books.get(genero5).remove(book);
                                System.out.println("Livro removido!");
                            }
                        } else {
                            System.out.println("Livro não existe!");
                        }

                    } else {
                        System.out.println("Género não existe!");
                    }
                    break;

                case 7: // editar um genero
                    if (books.isEmpty()) {
                        System.out.println("Não existem géneros!");
                        break;
                    }
                    System.out.println("Géneros existentes: " + books.keySet());
                    String genero6 = sc.nextLine();
                    if (books.containsKey(genero6)) {
                        String novoNome = UserInput.stringNVInput("Novo nome? ");
                        HashSet<Book> livros = books.get(genero6);
                        books.remove(genero6);
                        books.put(novoNome, livros);
                        System.out.println("Género editado!");
                    } else {
                        System.out.println("Género não existe!");

                    }
                    break;

                case 8: // editar um livro dum genero
                    if (books.isEmpty()) {
                        System.out.println("Não existem géneros nem livros!");
                        break;
                    }
                    System.out.println("Géneros existentes: " + books.keySet());
                    String genero7 = UserInput.stringNVInput("Genero? ");
                    if (books.containsKey(genero7)) {
                        System.out.println("Livros existentes: " + books.get(genero7));
                        String nomelivro = UserInput.stringNVInput("Livro? ");
                        Book book = searchBookByName(nomelivro, books.get(genero7));
                        if (book != null) {
                            if (books.get(genero7).contains(book)) {
                                String novoTitulo = UserInput.stringNVInput("Novo título? ");
                                String novoAutor = UserInput.stringNVInput("Novo autor? ");
                                int novoAno = UserInput.intInput("Novo ano? ");
                                book.setTitle(novoTitulo);
                                book.setAuthor(novoAutor);
                                book.setYear(novoAno);
                                System.out.println("Livro editado!");
                            }
                        } else {
                            System.out.println("Livro não existe!");
                        }

                    } else {
                        System.out.println("Género não existe!");
                    }
                    break;

                case 0:
                    System.out.print("Adeus!");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida!");

            }

        }
        sc.close();

    }

    public static Book searchBookByName(String nome, HashSet<Book> books) {
        for (Book book : books) {
            if (book.getTitle().equals(nome)) {
                return book;
            }
        }
        return null;
    }

}

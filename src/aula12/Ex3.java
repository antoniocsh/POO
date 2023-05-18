package aula12;

import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import utils.*;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Ex3 {
    public static void main(String[] args) {
        MovieManager MM = new MovieManager();
        try {
            MM.loadMovies("movies.txt");
        } catch (IOException e) {
            System.out.println("Erro ao ler ficheiro");
        }
        boolean continuar = true;
        while (continuar) {
            System.out.println("-=-=-=-MENU-=-=-=-");
            System.out.println("1 - Ordenar filmes por nome");
            System.out.println("2 - Ordenar filmes por score");
            System.out.println("3 - Ordenar filmes por duração");
            System.out.println("4 - Mostrar número de filmes por género");
            System.out.println("5 - Escrever num ficheiro 'myselection.txt' os filmes com mais score de um género");
            System.out.println("0 - Sair");
            System.out.println("-=-=-=-=-=-=-=-");

            int resposta = UserInput.intInput("Qual a sua opção? ");
            switch (resposta) {
                case 1:

                    printMovies(MM.sortMoviesbyName());
                    break;

                case 2:
                    printMovies(MM.sortMoviesbyScore());
                    break;

                case 3:
                    printMovies(MM.sortMoviesbyRunningTime());
                    break;

                case 4:
                    printGeneroNumero(MM.genreNumber());
                    break;

                case 5:
                    String genre = UserInput.stringInput("Qual o género? ");
                    writeFile(MM.getMovies60score(genre));
                    break;
                
                case 0:
                    continuar = false;
                    System.out.println("Adeus!");
                    break;
                
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    private static void printMovies(List<Movie> movies) {
        System.out.println("----------Movies----------");
        System.out.printf("%40s\t%10s\t%10s\t%10s\t%12s\n", "Name", "Score", "Rating", "Genre", "Running Time");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    private static void writeFile(List<Movie> movies) {
        try {
            FileWriter fileW = new FileWriter("myselection.txt");
            PrintWriter printW = new PrintWriter(fileW);
            printW.write(String.format("%40s\t%10s\t%10s\t%10s\t%12s\n", "Name", "Score", "Rating", "Genre", "Running Time"));
            for (Movie movie : movies) {
                printW.write(movie.toString());
                printW.write("\n");
            }

            printW.close();
            fileW.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void printGeneroNumero(TreeMap<String, Integer> movies) {
        System.out.println("----------Movies----------");
        System.out.printf("%10s\t%16s\n", "Genre", "Number of Movies");
        for (Map.Entry<String, Integer> entry : movies.entrySet()) {
            System.out.printf("%10s\t%16d\n", entry.getKey(), entry.getValue());
            
        }
    }

}

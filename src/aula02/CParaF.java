package aula02;
import java.util.Scanner;

public class CParaF {
    public static void main(String[] args){
        double grausCelcius, grausFahr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura em ºC: ");
        grausCelcius = sc.nextDouble();
        grausFahr = ( 1.8 * grausCelcius) + 32;
        System.out.format("Temperatura em Fahrenheit: %.2f ºF", grausFahr);
        sc.close();
    }    
}

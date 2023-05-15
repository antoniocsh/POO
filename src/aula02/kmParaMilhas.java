package aula02;
import java.util.Scanner;

public class kmParaMilhas {
    public static void main ( String[] args ) {
        double CONVERTER = 1.609;
        double kilometros, milhas;
        Scanner sc = new Scanner(System.in);
        System.out.print("Distância em km: ");
        kilometros = sc.nextDouble();
        milhas = kilometros / CONVERTER;
        System.out.println("Distância em milhas: " + milhas);
        sc.close();

    }
    
}

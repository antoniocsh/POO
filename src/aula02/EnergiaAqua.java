package aula02;
import java.util.Scanner;

public class EnergiaAqua {
    public static void main (String[] args){
        double Massa, tempFinal, tempInicial, Energia, CONSTANTE;
        CONSTANTE = 4184;
        Scanner sc = new Scanner(System.in);
        System.out.print("Massa em kg: ");
        Massa = sc.nextDouble();
        System.out.print("Temperatura inicial em ºC: ");
        tempInicial = sc.nextDouble();
        System.out.print("Temperatura final em ºC: ");
        tempFinal = sc.nextDouble();
        Energia = Massa * (tempFinal - tempInicial) * CONSTANTE;
        System.out.format("Energia necessária: %.2f J", Energia);
        sc.close();
    }   
}

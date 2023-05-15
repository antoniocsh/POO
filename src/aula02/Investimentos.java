package aula02;
import java.util.Scanner;

public class Investimentos {
    public static void main (String[] args){
    double investimentos, juros, valorFinal;
    Scanner sc = new Scanner(System.in);
    System.out.print("Valor investido: ");
    investimentos = sc.nextDouble();
    System.out.print("Taxa de juros: ");
    juros = sc.nextDouble() / 100;
    valorFinal = investimentos * Math.pow((1+juros),3);
    System.out.format("O valor final depois de 3 meses é de %.2f EUR", valorFinal);
    sc.close();
    }
}

package aula02;

import java.util.Scanner;

public class DistanciaPontos {
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        double x1, x2, y1, y2, distancia;
        System.out.print("x1? ");
        x1 = sc.nextDouble();
        System.out.print("y1? ");
        y1 = sc.nextDouble();
        System.out.print("x2? ");
        x2 = sc.nextDouble();
        System.out.print("y2? ");
        y2 = sc.nextDouble();

        distancia = Math.sqrt( Math.pow((x1-x2) , 2) + Math.pow((y1-y2) , 2) );
        System.out.format("A distância entre os dois pontos é de %.2f unidades.", distancia);
        sc.close();

    }
    
}

package aula02;

import java.util.Scanner;

public class VelocidadeMedia {
    public static void main ( String[] args){
        double v1, v2, d1, d2, t1, t2, velMedia;
        v1 = -1; v2 = -1; d1 = -1; d2 = -1; 
        Scanner sc = new Scanner(System.in);
        while (v1 <= 0){
            System.out.print("Velocidade 1 em m/s: ");
            v1 = sc.nextDouble();
        }
        while (d1 <= 0){
            System.out.print("Distância 1 em m: "); 
            d1 = sc.nextDouble();
        }
        while (v2 <= 0){
            System.out.print("Velocidade 2 em m/s: ");
            v2 = sc.nextDouble();
        }
        while (d2 <= 0){
            System.out.print("Distância 2 em metros: ");
            d2 = sc.nextDouble();
        }

        t1 = d1/v1; t2 = d2/v2;
        velMedia = (d1 + d2) / (t1 + t2);

        System.out.format("Velocidade média: %.2f m/s", velMedia);
        sc.close();

        





    }
}

package aula02;

import java.util.Scanner;

public class PitagorasAngulo {
    public static void main(String[] args){
        double Hipot, Angulo, Cosseno, catetoA = -1, catetoB = -1, PI = 3.14159;
        Scanner sc = new Scanner(System.in);
        while (catetoA <= 0 ){
        System.out.print("Comprimento do Cateto A: ");
        catetoA = sc.nextDouble();
        }
        while (catetoB <= 0 ){
            System.out.print("Comprimento do Cateto B: ");
            catetoB = sc.nextDouble();
    }
        Hipot = Math.sqrt( Math.pow(catetoA, 2) + Math.pow(catetoB, 2) );
        Cosseno = catetoA / Hipot ;
        Angulo = (Math.acos(Cosseno) * 180) / PI;

        System.out.format("A Hipotenusa mede %.2f unidades e o ângulo entre os dois catetos é de %.2fº", Hipot, Angulo);
        sc.close();
    }
    
}

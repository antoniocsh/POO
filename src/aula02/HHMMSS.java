package aula02;

import java.util.Scanner;

public class HHMMSS {
    public static void main(String[] args){
        long tempotodo, segundos, horas, minutos;
        Scanner sc = new Scanner(System.in);
        tempotodo = -1;
        while (tempotodo < 0){   
        System.out.print("Tempo em segundos: ");
        tempotodo = sc.nextLong();
    }
        horas = tempotodo / 3600;
        minutos = tempotodo % 3600 / 60;
        segundos = tempotodo % 3600 % 60;
        System.out.format("Tempo no formato hh:mm:ss -> %02d:%02d:%02d", horas, minutos, segundos);
        sc.close();

    }
    
}

package aula02;

import java.util.Scanner;

public class ContMinMaxMed {
    public static void main(String[] args) {
        double min = 1, max = 1, controlo, total = 0, contagem = 1, numero, media;
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        controlo = sc.nextDouble();
        if (controlo > max){max = controlo;}
        if (controlo < min){min = controlo;}
        total += controlo;
        numero = controlo + 1;

        while ( numero != controlo){
            System.out.print("Número: ");
            numero = sc.nextDouble();
            total += numero; 
            if (numero > max){max = numero;}
            if (numero < min){min = numero;}
            contagem++;
        }
        
        media = total / contagem;
        System.out.format("Valor máximo: %.2f \nValor mínimo: %.2f \nMédia: %.2f \nQuantidade de números introduzidos: %.0f", max, min, media, contagem);
        sc.close(); 
    }
}

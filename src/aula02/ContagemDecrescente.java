package aula02;

import java.util.Scanner;

public class ContagemDecrescente {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long valor = -1;
        while (valor <= 0){
            System.out.print("Digite um número inteiro: ");
            valor = sc.nextLong();
        }
        while (valor > 0){
            if (valor % 10 == 0){
            System.out.println(valor + ",");
            valor--;}
            else{
                System.out.print(valor + ",");
            valor--;}
        }
            System.out.print(valor);
            
            sc.close();
    }
    
}

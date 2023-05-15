package aula03;

import utils.*;

public class Ex1_SomaPrimos {
    public static void main(String[] args) {
        int n = UserInput.posintInput("Insira um número positivo: ");
        int soma = 0 ;
        for (int i = 2; i <= n; i++){
            if (primeNum.isPrime(i)){
                soma += i;
            }
        }
        System.out.printf("Soma de todos os números primos até %d (inclusive): %d", n, soma);


    }



}

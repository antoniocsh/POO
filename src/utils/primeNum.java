package utils;

public class primeNum {
    public static boolean isPrime(int numarg){
        int contagem = 0;
        for (int i = 2; i < numarg; i++ ){
            if (numarg % i == 0 ){
                contagem++;
            }     
        }

        if (contagem ==0){
            return true;
        }
        else{
            return false;
        }

    }

    
}

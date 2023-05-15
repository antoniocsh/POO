package utils;

import java.util.Scanner;


public class UserInput {
    private static Scanner sc = new Scanner(System.in);

    public static double doubleInput(String textholder) {
        System.out.print(textholder);
        while (!sc.hasNextDouble()) {
            System.out.println("Por favor insira um número. ");
            sc.nextLine();
        }
        double numero = sc.nextDouble();
        sc.nextLine();
        return numero;
        
    }

    public static double posdoubleInput(String textholder){
        double numero = UserInput.doubleInput(textholder);
        while (numero <= 0){
            numero = UserInput.doubleInput("Por favor insira um número positivo. ");
        }
        return numero;
    }

    public static int intInput(String textholder){
        System.out.print(textholder);
        while (!sc.hasNextInt()){
            System.out.println("Por favor insira um número inteiro. ");
            sc.nextLine();     
        }

        int numero = sc.nextInt();
        sc.nextLine();
        return numero;
    }

    public static int posintInput(String textholder){
        int numero = UserInput.intInput(textholder);
        while (numero <= 0){
            numero = UserInput.intInput("Por favor insira um número positivo. ");
        }
        return numero;
    }


    public static int posintmultiploInput(String textholder, int multiplo){
        int numero = UserInput.posintInput(textholder);
        while(numero % multiplo != 0){
            numero = UserInput.posintInput("Por favor insira um valor múltiplo de "+multiplo+". ");
        }
        return numero;

    }

    public static double doubleIntervalo(String textholder, double a, double b){
        double numero = doubleInput(textholder);
        while (numero < a || numero > b){
            numero = UserInput.doubleInput("Por favor insira um número entre "+a+" e "+b+". ");
        }
        return numero;
    }

    public static int intIntervalo(String textholder, int a, int b){
        int numero = intInput(textholder);
        while (numero < a || numero > b) {
            numero = UserInput.intInput("Por favor insira um número entre "+a+" e "+b+". ");
        }
        return numero;
    }

    public static String stringInput(String textholder){
        System.out.print(textholder);
        String palavra = sc.nextLine();
        return palavra;
    }

    public static String stringNVInput(String textholder){
        String str = stringInput(textholder);
        while (str.equals("")){
            str = stringInput("Por favor insira uma ou várias palavras. ");
        }
        return str;
    }

    public static String stringVInput(String textholder){
        System.out.println(textholder);
        return sc.nextLine();
    }
    

}
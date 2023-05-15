package aula07;

import java.util.Scanner;
import utils.*;

public class Ex2b_DataND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        DateND data = null;
        int opcao;
        int dia;
        int mes;
        int ano;
        while (continuar){
            System.out.println("-=-=-=-MENU-=-=-=-");
            System.out.println("1 - Criar nova data");
            System.out.println("2 - Mostrar data actual");
            System.out.println("3 - Incrementar a data");
            System.out.println("4 - Decrementar a data");
            System.out.println("0 - Sair");
            System.out.println("-=-=-=-=-=-=-=-");

            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                do {
                ano = UserInput.intInput("Ano? ");
                mes = UserInput.intInput("Mês? ");
                dia = UserInput.intInput("Dia? ");
                data = new DateND(dia, mes, ano);
                } while(!data.valid(dia, mes, ano));
                break;
                case 2:
                System.out.println(data);
                break;

                case 3:
                int incremento = UserInput.posintInput("Incremento? ");
                data.increment(incremento);
                System.out.println(data);
                break;

                case 4:
                int decremento = UserInput.posintInput("Decremento? ");
                data.decrement(decremento);
                System.out.println(data);
                break;

                case 0:
                System.out.println("Adeus!");
                continuar = false;
                break;

                default:
                System.out.println("Opção inválida!");
            }
    }

    sc.close();
}
}
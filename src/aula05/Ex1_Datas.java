package aula05;

import java.util.Scanner;
import utils.*;

public class Ex1_Datas {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        DateYMD data = null;
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
                data = new DateYMD(dia, mes, ano);
                } while(!data.valid(dia, mes, ano));
                break;
                case 2:
                System.out.println(data);
                break;

                case 3:
                data.increment();
                System.out.println(data);
                break;

                case 4:
                data.decrement();
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
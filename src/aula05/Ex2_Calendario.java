package aula05;

import utils.*;

public class Ex2_Calendario {
    
    public static void main(String[] args) {
        int ano = 0;
        Calendario cal = null;
        boolean continuar = true;
        while (continuar){
            System.out.println("-=-=-=-MENU-=-=-=-");
            System.out.println("1 - Criar calendário");
            System.out.println("2 - Mostrar um mês");
            System.out.println("3 - Mostrar o ano");
            System.out.println("4 - Adicionar um evento");
            System.out.println("5 - Remover um evento");
            System.out.println("0 - Sair");
            int opcao = UserInput.intInput("Opção? ");

            switch (opcao){
                case 1:
                ano = UserInput.intIntervalo("Ano? ", 0, 9999);
                int pDiaSem = UserInput.intIntervalo("Primeiro dia da semana? ", 1, 7);
                cal = new Calendario(ano, pDiaSem);
                break;

                case 2:
                int mes = UserInput.intIntervalo("Mês? ", 1, 12);
                cal.printMonth(mes);
                break;

                case 3:
                cal.printCalendario();
                break;

                case 4:
                if (cal == null){
                    System.out.println("Calendário não criado!");
                    break;
                }
                else{
                mes = UserInput.intIntervalo("Mês? ", 1, 12);
                int dia = UserInput.intIntervalo("Dia? ", 1, DateYMD.monthDays(ano, mes));
                cal.addEvent(mes, dia);}
                break;

                case 5:
                if (cal == null){
                    System.out.println("Calendário não criado!");
                    break;
                }
                else{
                mes = UserInput.intIntervalo("Mês? ", 1, 12);
                int dia = UserInput.intIntervalo("Dia? ", 1, DateYMD.monthDays(ano, mes));
                cal.removeEvent(mes, dia);}
                break;

                case 0:
                System.out.println("Adeus!");
                continuar = false; 
                break;

                default:
                System.out.println("Opção inválida!");
            }
        }

























        




    }
}

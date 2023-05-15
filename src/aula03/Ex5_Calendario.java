package aula03;

import utils.*;

public class Ex5_Calendario {
    public static void main(String[] args) {
        String[][] calendario = new String[5][7];
        String mesAno;
        int linha = 0;

        do {
            mesAno = UserInput.stringInput("Insira o mês e o ano no formato mm/yyyy: ");
        }
        while (

        mesAno.length() < 3
        || mesAno.length() > 7
        || (mesAno.split("/", 0)).length != 2 
        || ((mesAno.split("/", 0)[0]).length() != 2 && (mesAno.split("/", 0)[0]).length() != 1 )
        || (mesAno.split("/", 0)[1]).length() > 4
        || (mesAno.split("/", 0)[1]).length() < 1
        || 0 >= Integer.valueOf(mesAno.split("/", 0)[0]) 
        || 13 <= Integer.valueOf(mesAno.split("/", 0)[0]) 
        || 0 > Integer.valueOf(mesAno.split("/", 0)[1])
        || 9999 < Integer.valueOf(mesAno.split("/", 0)[1])

        );

        int mes = Integer.valueOf(mesAno.split("/", 0)[0]);

        int ano = Integer.valueOf(mesAno.split("/", 0)[1]);

        int diaUm = UserInput.intIntervalo("Insira o dia da semana em que o mês começa.\n(1 = Segunda, 2 = Terça, 3 = Quarta, 4 = Quinta, 5 = Sexta, 6 = Sábado, 7 = Domingo) ", 1, 7);
        int diasT = quantdias(ano, mes);

        for (int i = 1; i <= diasT; i++){
            int index = (diaUm + i - 1) % 7;
            calendario[linha][index] = String.valueOf(i);
            if (index == 6){
                linha++;
            }
        }

        printCalendar(mes, ano, calendario);

    }

    public static String nomeMes(int mes){
        String[] meses = {"January", "February", "March", "April", "May", "June", 
        "July", "August", "September", "October", "November", "December"};

        return meses[mes-1];

    }

    public static int quantdias(int getAno, int getMes){
        int dias;
        switch (getMes){
            case 4: case 6: case 9: case 11:
            dias = 30;
            break;
            case 2:
            if (getAno%4==0){
                if (getAno%400==0){
                    dias = 29;
                    break;
                }
                else{
                    dias = 28;
                    break;
                }
            }
            else{
                dias = 28;
                break;
            }
            default: 
            dias = 31;
        }
        return dias;
    }

    public static void printCalendar(int getMes, int getAno, String[][] getCal){
        System.out.printf("%11s %d\n", nomeMes(getMes), getAno );
        System.out.printf("Su Mo Tu We Th Fr Sa\n");
        for (int i = 0; i <5; i++){
            for (int j = 0; j < 7; j++){
                if (getCal[i][j] == null){getCal[i][j] = "";}
                if (j==6){ System.out.printf("%2s\n",getCal[i][j]);}
                else{System.out.printf("%2s ",getCal[i][j]);}
               
            }
        }

    }
}

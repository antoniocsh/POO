package aula05;

class Calendario {
    private int ano;
    private int pDiaSem;
    private String[] meses = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    private int[][] eventos = new int[12][32];
    public Calendario(int ano, int pDiaSem){
        this.ano = ano;
        this.pDiaSem = pDiaSem;
    }
    
    public int getYear() {
        return ano;
    }

    public int firstWeekdayOfMonth(int mes) {
        int oi = pDiaSem;
        if (mes == 1) {
            return pDiaSem;
        } else {
            for (int i = 1; i < mes; i++)
            oi += DateYMD.monthDays(i, ano);
            oi = oi % 7;
            if (oi == 0)
                oi = 7;
            return oi;
        }
    }

    public void printMonth(int mes){
        String [][] calendarioMes = new String[6][7];
        int linha = 0;
        for (int i = 0; i < DateYMD.monthDays(mes, ano); i++){
            int index = (firstWeekdayOfMonth(mes) + i - 1) % 7;
            calendarioMes[linha][index] = String.valueOf(i+1);
            if (index == 6){
                linha++;
            }
        }
        System.out.printf(" %11s %d\n", meses[mes-1], ano);
        System.out.printf(" Su  Mo  Tu  We  Th  Fr  Sa \n");
        int count = 1;
            for (int i = 0; i <6; i++){
                for (int j = 0; j < 7; j++){
                    if (calendarioMes[i][j] == null){calendarioMes[i][j] = "";}
                    else if (calendarioMes[i][j] != null){
                        if (eventos[mes-1][count] > 0){
                            calendarioMes[i][j] = "*" + calendarioMes[i][j];
                        }
                        count++;
                    }

                    if (j==6){ System.out.printf("%3s\n",calendarioMes[i][j]);}
                    else{System.out.printf("%3s ",calendarioMes[i][j]);}
                }
            }
    }

    public void printCalendario(){
        for (int i = 1; i <= 12; i++){
            printMonth(i);
            System.out.println();
        }   
    }

    public void addEvent(int mes, int dia){
        eventos[mes-1][dia] += 1;
    }

    public void removeEvent(int mes, int dia){
        if (eventos[mes-1][dia] > 0){
        eventos[mes-1][dia] -= 1;}
    }

}

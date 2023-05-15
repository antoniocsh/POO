package aula07;

public class DateND extends Date {
    //1 / 1 / 2000
    long datadias;

    public DateND(int day, int month, int year) {
        if (valid(day, month, year)) {
        this.datadias = calcularDias(day, month, year);
        } else {
            System.out.println("Invalid date");
        }
    }

    private long calcularDias(int day, int month, int year) {
        int diasmes = monthDays(month, year);
        int dias = 0;
        if (year < 2000) {
            dias += diasmes - day;
            for (int i = month + 1; i <= 12; i++) {
                dias += monthDays(i, year);
            }
            for (int i = year + 1; i < 2000; i++) {
                if (leapYear(i)) {
                    dias += 366;
                } else {
                    dias += 365;
                }
            }
            dias = -dias;        
        }
        else if (year > 2000){
            dias += day;
            for (int i = month - 1; i >= 1; i--) {
                dias += monthDays(i, year);
            }
            for (int i = year - 1; i >= 2000; i--) {
                if (leapYear(i)) {
                    dias += 366;
                } else {
                    dias += 365;
                }
            }
            dias -= 1;
        }
        else {
            if (month != 1){
            dias += day;
            } else {
                dias += day - 1;
            }   
            for (int i = month - 1; i >= 1; i--) {
                dias += monthDays(i, year);
            }
        }
        return dias;
    }

    public void increment(int increment) {
        datadias += increment;
    }

    public void decrement(int decrement) {
        datadias -= decrement;
    }

    @Override
    public String toString() {
        if (datadias == 0){
            return String.format("a data é 1/1/2000");
        }
        return String.format("a data dista %d dias do dia 1/1/2000, %s", Math.abs(datadias), datadias > 0 ? "por cima" : "por baixo");
    }
    
    
}

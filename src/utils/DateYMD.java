package utils;
import java.time.OffsetDateTime;

public class DateYMD {
    private int day;
    private int month;
    private int year;

    public DateYMD(int day, int month, int year) {
        if (valid(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("Data inválida!");
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean validMonth(int month) {
        if (month < 1 || month > 12) {
            return false;
        }
        return true;
    }

    public static boolean leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0 )|| year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static int monthDays(int month, int year){
        switch (month) {
            case 4: case 6: case 9: case 11:
            return 30;
            case 2: if (leapYear(year)) {
                return 29;
            } else {
                return 28;
            }
            default:
            return 31;
        
    }
    }
    public boolean valid(int day, int month, int year) {
        return (validMonth(month) && day > 0 && day <= monthDays(month, year));
    }

    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }

    public void increment(){
        if (valid(day+1, month, year)){
            day += 1;
        }
        else if (valid(1, month+1, year)){
            day = 1;
            month += 1;
        }
        else if (valid(1, 1, year+1)){
            day = 1;
            month = 1;
            year += 1;
        }
    }

    public void decrement(){
        if (valid(day-1, month, year)){
            day -= 1;
        }
        else if (valid(monthDays(month-1, year), month-1, year)){
            day = monthDays(month-1, year);
            month -= 1;
        }
        else if (valid(31, 12, year-1)){
            day = 31;
            month = 12;
            year -= 1;
        }
    }
    public static DateYMD hoje() {
		OffsetDateTime dt = OffsetDateTime.now();
		int day = dt.getDayOfMonth();
		int month = dt.getMonthValue();
		int year = dt.getYear();
		return new DateYMD(day, month, year);
	}

    
}

package aula07;

public abstract class Date {
    private int day;
    private int month;
    private int year;

    public abstract void increment(int increment);
    public abstract void decrement(int decrement);
    

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
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


    // public String toString() {
    //     return String.format("%04d-%02d-%02d", year, month, day);
    // }
    }

 


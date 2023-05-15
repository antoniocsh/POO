package aula07;

public class DateYMD extends Date implements Comparable<DateYMD>{

    public DateYMD(int day, int month, int year) {
        if (valid(day, month, year)){
            setYear(year);
            setMonth(month);
            setDay(day);
        } else {
            System.out.println("Invalid date");
        }
    }

    
    public void increment(int increment){
        for (int i = 0; i < increment; i++){
            if (valid(getDay()+1, getMonth(), getYear())){
                setDay(getDay()+1);
            }
            else if (valid(1, getMonth()+1, getYear())){
                setDay(1);
                setMonth(getMonth()+1);
            }
            else if (valid(1, 1, getYear()+1)){
                setDay(1);
                setMonth(1);
                setYear(getYear()+1);
            } 
        }
    }

    public void decrement(int decrement){
        for (int i = 0; i < decrement; i++){
            if (valid(getDay()-1, getMonth(), getYear())){
                setDay(getDay()-1);
            }
            else if (valid(monthDays(getMonth()-1, getYear()), getMonth()-1, getYear())){
                setDay(monthDays(getMonth()-1, getYear()));
                setMonth(getMonth()-1);
            }
            else if (valid(31, 12, getYear()-1)){
                setDay(31);
                setMonth(12);
                setYear(getYear()-1);
            } 
        }
    }
    
    @Override
    public String toString(){
        return String.format("%02d/%02d/%04d", getDay(), getMonth(), getYear());
    }


    @Override
    public int compareTo(DateYMD o) {
        if (this.getDay() == o.getDay() && this.getMonth() == o.getMonth() && this.getYear() == o.getYear()){
            return 0;
        }
        else if (this.getYear() > o.getYear()){
            return 1;
        }
        else if (this.getYear() < o.getYear()){
            return -1;
        }
        else if (this.getMonth() > o.getMonth()){
            return 1;
        }
        else if (this.getMonth() < o.getMonth()){
            return -1;
        }
        else if (this.getDay() > o.getDay()){
            return 1;
        }
        else if (this.getDay() < o.getDay()){
            return -1;
        }


        // Auto-generated method stub

        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");

    }
    
    


    
}

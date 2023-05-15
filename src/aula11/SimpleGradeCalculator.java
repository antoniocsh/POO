package aula11;

import java.util.List;

public class SimpleGradeCalculator implements IGradeCalculator {

    @Override
    public double calculate(List<Double> grades) {
        double soma = 0;
        for (Double grade : grades) {
            soma += grade;
        }
        return Math.round(soma / grades.size()*100.0)/100.0;
    }
    
}

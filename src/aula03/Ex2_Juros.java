package aula03;

import utils.*;

public class Ex2_Juros {
    public static void main(String[] args) {
    int investido = UserInput.posintmultiploInput("Insira o valor do montante investido. ", 1000);
    double juros = UserInput.doubleIntervalo("Insira a percentagem de juros mensais. ", 0, 5);
    for (int i = 1; i < 13; i++){
        double total = investido * Math.pow((1+juros/100),i);
        System.out.printf("Valor no %dº mês: %.2f\n", i, total);
    }

}
}

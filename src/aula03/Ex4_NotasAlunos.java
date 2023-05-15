package aula03;

import utils.*;
import java.util.Random;

public class Ex4_NotasAlunos {
    public static void main(String[] args) {
        int alunos = UserInput.posintInput("Quantidade de alunos? ");
        double[][] pauta = new double[alunos][3];

        for (int i = 0; i < alunos; i++){
            Random notarandom = new Random();
            double notat = notarandom.nextDouble(20);
            double notap = notarandom.nextDouble(20);
            pauta[i][0] = notat;
            pauta[i][1] = notap;
            pauta[i][2] = Math.round(notafinal(notat, notap));
        }
        
        System.out.printf("%6s %6s %6s\n", "Notat", "NotaP", "Pauta");
        for (int i = 0; i < alunos; i++){
            System.out.printf("%6.1f %6.1f %6.0f\n", pauta[i][0], pauta[i][1], pauta[i][2]);
        }

    }
    public static double notafinal(double teorica, double pratica){
        double notafn;
            if (teorica < 7.0 || pratica < 7.0){
                notafn = 66;
            }
            else{
                notafn = 0.4*teorica + 0.6*pratica;
            }
            return notafn;
        }
}

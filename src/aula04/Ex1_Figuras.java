package aula04;

import utils.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ex1_Figuras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        List<Circulo> circulos = new ArrayList<>();
        List<Triangulo> triangulos = new ArrayList<>();
        List<Retangulo> retangulos = new ArrayList<>();
    
    while (continuar){
        System.out.println("-=-=-=-MENU-=-=-=-");
        System.out.println("(C)írculo");
        System.out.println("(T)riângulo");
        System.out.println("(R)etângulo");
        System.out.println("(D)ados das figuras");
        System.out.println("(COMPARAR) figuras");
        System.out.println("(S)air");
        System.out.println("-=-=-=-=-=-=-=-");
        
    
        String resposta = sc.next();
        resposta = resposta.toUpperCase();
        if (resposta.equals("C")){
            double raio = UserInput.doubleInput("Qual o raio do círculo? ");
            Circulo c = new Circulo(raio);
            circulos.add(c);
            System.out.println(c);
        }
        else if (resposta.equals("T")){
            double lado1 = UserInput.posdoubleInput("Qual o lado 1 do triângulo? ");
            double lado2 = UserInput.posdoubleInput("Qual o lado 2 do triângulo? ");
            double lado3 = UserInput.posdoubleInput("Qual o lado 3 do triângulo? ");
            Triangulo t = new Triangulo(lado1, lado2, lado3);
            triangulos.add(t);
            System.out.println(t);
        }
        else if (resposta.equals("R")){
            double base = UserInput.posdoubleInput("Qual a base do retângulo? ");
            double altura = UserInput.posdoubleInput("Qual a altura do retângulo? ");
            Retangulo r = new Retangulo(base, altura);
            retangulos.add(r);
            System.out.println(r);
        }
        else if (resposta.equals("D")){
            System.out.println("Qual a figura? (C)írculo, (T)riângulo, (R)etângulo\n");
            String figura = sc.next();
            figura = figura.toUpperCase();
            if (figura.equals("C")){
                System.out.println(circulos);
            }
            else if (figura.equals("T")){
                System.out.println(triangulos);
            }
            else if (figura.equals("R")){
                System.out.println(retangulos);
            }
            else{
                System.out.println("Opção inválida");
            }
        }

        else if (resposta.equals("S")){
            continuar = false;
        }
        else if (resposta.equals("COMPARAR")){
            System.out.println("Qual a figura a comparar? (C)írculo, (T)riângulo, (R)etângulo\n");
            String figura = sc.next();
            figura = figura.toUpperCase();
            if (figura.equals("C")){
                if (circulos.size() == 0){
                    System.out.println("Não existem círculos!");
                }
                else{
                    for (int i = 0; i < circulos.size(); i++){
                    System.out.println(i + " -> " + circulos.get(i));
                }
                int indice1 = UserInput.intIntervalo("Qual o índice do primeiro círculo a comparar? ", 0, circulos.size());
                int indice2 = UserInput.intIntervalo("Qual o índice do segundo círculo a comparar? " , 0, circulos.size());
                boolean verdade = circulos.get(indice1).equals(circulos.get(indice2));
                if (verdade == true){
                    System.out.println("Os círculos são iguais");
                }
                else{
                    System.out.println("Os círculos são diferentes");
                }
            }
            }
            else if (figura.equals("T")){
                if (triangulos.size() == 0){
                    System.out.println("Não existem triangulos!");
                }
                else {
                    for (int i = 0; i < triangulos.size(); i++){
                    System.out.println(i + " -> " + triangulos.get(i));
                }
                int indice1 = UserInput.intIntervalo("Qual o índice do primeiro triângulo a comparar? ", 0, triangulos.size());
                int indice2 = UserInput.intIntervalo("Qual o índice do segundo triângulo a comparar? ", 0, triangulos.size());
                boolean verdade = triangulos.get(indice1).equals(triangulos.get(indice2));
                if (verdade == true){
                    System.out.println("Os triângulos são iguais");
                }
                else{
                    System.out.println("Os triângulos são diferentes");
                }
            }
            }
            else if (figura.equals("R")){
                if (retangulos.size() == 0){
                    System.out.println("Não existem retângulos!");
                    
                }
                else{
                for (int i = 0; i < retangulos.size(); i++){
                    System.out.println(i + " -> " + retangulos.get(i));
                }
                int indice1 = UserInput.intIntervalo("Qual o índice do primeiro retângulo a comparar? ", 0, retangulos.size());
                int indice2 = UserInput.intIntervalo("Qual o índice do segundo retângulo a comparar? ", 0, retangulos.size());
                boolean verdade = retangulos.get(indice1).equals(retangulos.get(indice2));
                if (verdade == true){
                    System.out.println("Os retângulos são iguais");
                }
                else{
                    System.out.println("Os retângulos são diferentes");
                }
            }
            }
            else{
                System.out.println("Opção inválida");
            }
            
        }


    
}
sc.close();
   

}
}
    






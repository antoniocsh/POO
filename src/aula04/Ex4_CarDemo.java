// package aula04;

// import java.util.Scanner;

// class Car {
//     public String make;
//     public String model;
//     public int year;
//     public int kms;

//     public Car(String make, String model, int year, int kms) {
//         this.make = make;
//         this.model = model;
//         this.year = year;
//         this.kms = kms;
//     }

//     public void drive(int distance) {
//         this.kms += distance;

//     }

// }

// public class Ex4_CarDemo {

//     static Scanner sc = new Scanner(System.in);

//     static int registerCars(Car[] cars) {
//         // pede dados dos carros ao utilizador e acrescenta ao vetor
//         // registo de carros termina quando o utilizador inserir uma linha vazia 
//         // devolve número de carros registados~
//         int index = 0;
//         int contagem = 0;
//         while (true) {        
//             System.out.print("Insira dados do carro (marca modelo ano quilómetros): ");
//             String line = sc.nextLine();
//             if (line.isEmpty()) {
//                 break;
//             }
//             String[] carro = line.split(" ");
//             if (4 > carro.length) {
//                 System.out.println("Dados inválidos! ");
//                 continue;
//             } 
//             try {
//                 Integer.parseInt(carro[carro.length-2]);
//             } catch (NumberFormatException nfe) {
//                 System.out.println("Dados inválidos! Ano do Carro deve ser um número! ");
//                 continue;
//             }  
//             try {
//                 Integer.parseInt(carro[carro.length-1]);
//             } catch (NumberFormatException nfe) {
//                 System.out.println("Dados inválidos! Quilómetros do Carro deve ser um número! ");
//                 continue;
//             }
//             if (Integer.parseInt(carro[carro.length-2]) < 0 || Integer.parseInt(carro[carro.length-2]) > 9999) {
//                 System.out.println("Dados inválidos! Ano deve positivo e ter 4 dígitos!");
//                 continue;
//             }
//             if (Integer.parseInt(carro[carro.length-1]) < 0) {
//                 System.out.println("Dados inválidos! Quilómetros não podem ser negativos!");
//                 continue;
//             }
           
          
//             String make = carro[0];
//             String model = carro[1];
//             for (int i = 2; i < carro.length - 2; i++) {
//                 model += " " + carro[i];
//             }
//             int year = Integer.parseInt(carro[(carro.length-2)]);
//             int kms = Integer.parseInt(carro[carro.length-1]);
//             cars[index] = new Car(make, model, year, kms);
//             contagem++;
//             index++;
//         }
//         return contagem;

//    }

//     static void registerTrips(Car[] cars, int numCars) {
//         // pede dados das viagens ao utilizador e atualiza informação do carro
//         // registo de viagens termina quando o utilizador inserir uma linha vazia 
//         do{ System.out.print("Registe uma viagem no formato \"carro:distância\": ");
//         String carrodist = sc.nextLine();
//         if (carrodist.isEmpty()) {
//             break;
//         }
//         String[] carrodistarray = carrodist.split(":");
//         if (carrodistarray.length != 2) {
//             System.out.println("Dados inválidos! ");
//             continue;
//         }
//         try {
//             Integer.parseInt(carrodistarray[0]);
//         } catch (NumberFormatException nfe) {
//             System.out.println("Dados inválidos! Número do Carro deve ser um número! ");
//             continue;
//         }
//         try {
//             Integer.parseInt(carrodistarray[1]);
//         } catch (NumberFormatException nfe) {
//             System.out.println("Dados inválidos! Distância deve ser um número! ");
//             continue;
//         }
        
//         if (Integer.parseInt(carrodistarray[0]) > cars.length || Integer.parseInt(carrodistarray[0]) < 0) {
//             System.out.println("Dados inválidos! ");
//             continue;
//         }
//         else if (Integer.parseInt(carrodistarray[1]) < 0) {
//             System.out.println("Distância não pode ser negativa! ");
//             continue;
//         }
//         if (cars[Integer.parseInt(carrodistarray[0])] == null) {
//             System.out.println("Dados inválidos! ");
//             continue;
//         }
//         cars[Integer.parseInt(carrodistarray[0])].drive(Integer.parseInt(carrodistarray[1]));
//     } while(true);
        
//     }


//     static void listCars(Car[] cars) {
//         System.out.println("\nCarros registados:\n ");
//         // lista todos os carros registados
//         // Exemplo de resultado
//         // Carros registados: 
//         // Toyota Camry, 2010, kms: 234346
//         // Renault Megane Sport Tourer, 2015, kms: 32536

//         for (int i = 0; i < cars.length; i++) {
//             if (cars[i] == null) {
//                 break;
//             }
//             System.out.printf( "%s, %s, %d, kms: %d \n", cars[i].make, cars[i].model, cars[i].year, cars[i].kms);
//         }   
//         System.out.println("\n");
//     }

//     public static void main(String[] args) {

//         Car[] cars = new Car[10];

//         int numCars = registerCars(cars);

//         if (numCars>0) {
//             listCars(cars);
//             registerTrips(cars, numCars);
//             listCars(cars);
//         }

//         sc.close();

//     }
// }
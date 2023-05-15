package aula09;

import java.util.Scanner;
import utils.*;

public class PlaneTester {
    public static void main(String[] args) {
        PlaneManager planeManager = new PlaneManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nPlane Fleet Menu:");
            System.out.println("1. Add a plane to the fleet");
            System.out.println("2. Remove a plane from the fleet");
            System.out.println("3. Search for a plane");
            System.out.println("4. Print summary of all planes in the fleet");
            System.out.println("5. Print list of all commercial planes in the fleet");
            System.out.println("6. Print list of all military planes in the fleet");
            System.out.println("7. Print the fastest plane in the fleet");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPlane(planeManager);
                    break;
                case 2:
                    removePlane(planeManager);
                    break;
                case 3:
                    searchPlane(planeManager);
                    break;
                case 4:
                    printAllPlanes(planeManager);
                    break;
                case 5:
                    printCommercialPlanes(planeManager);
                    break;
                case 6:
                    printMilitaryPlanes(planeManager);
                    break;
                case 7:
                    printFastestPlane(planeManager);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    
    private static void addPlane(PlaneManager planeManager) {
        String id = UserInput.stringNVInput("Enter plane ID: ");
        String name = UserInput.stringNVInput("Enter plane name: ");
        String manufacturer = UserInput.stringNVInput("Enter plane manufacturer: ");
        String model = UserInput.stringNVInput("Enter plane model: ");
        int year = UserInput.posintInput("Enter plane year of fabrication: ");
        int NumPassageiros = UserInput.posintInput("Enter plane max passengers: ");
        int maxSpeed = UserInput.intInput("Enter plane max speed: ");
        int Type = UserInput.intInput("Enter plane type: \n1. Commercial\n2. Military\n");
        switch (Type){
            case 1:
                int numTripulantes = UserInput.posintInput("Enter plane number of tripulants: ");
                planeManager.addPlane(new CommercialPlane(id, name, manufacturer, model, year, NumPassageiros, maxSpeed, numTripulantes));
                break;
            case 2:
                int numAmmo = UserInput.posintInput("Enter plane number of ammunition: ");
                planeManager.addPlane(new MilitaryPlane(id, name, manufacturer, model, year, NumPassageiros, maxSpeed, numAmmo));
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }

    private static void removePlane(PlaneManager planeManager) {
        String id = UserInput.stringNVInput("Enter plane ID: ");
        planeManager.removePlane(id);
    }

    private static void searchPlane(PlaneManager planeManager) {
        String id = UserInput.stringNVInput("Enter plane ID: ");
        Plane plane = planeManager.searchPlane(id);
        if (plane != null) {
            System.out.println(plane.toString());
        }
    }

    private static void printAllPlanes(PlaneManager planeManager) {
        System.out.println(planeManager.getAllPlanes());
    }

    private static void printCommercialPlanes(PlaneManager planeManager) {
        System.out.println(planeManager.getCommercialPlanes());

    }

    private static void printMilitaryPlanes(PlaneManager planeManager) {
        System.out.println(planeManager.getMilitaryPlanes());
    }

    private static void printFastestPlane(PlaneManager planeManager) {
        if (planeManager.getFastestPlane() == null) {
            System.out.println("No planes in the fleet.");
        }
        else{
            System.out.println("Fastest plane:");
        System.out.println(planeManager.getFastestPlane());
    }

    }

}

package zadanie2;

import java.util.InputMismatchException;
import java.util.Queue;
import java.util.Scanner;

public class VehicleUtil {

    static void addVehicle(Queue queue){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Podaj typ pojazdu: ");
            String type = sc.nextLine();
            System.out.println("Podaj markę: ");
            String brand = sc.nextLine();
            System.out.println("Podaj model: ");
            String model = sc.nextLine();
            System.out.println("Podaj rok produkcji: ");
            int year = sc.nextInt();
            sc.nextLine();
            System.out.println("Podaj przebieg: ");
            double mileage = sc.nextDouble();
            sc.nextLine();
            System.out.println("Podaj VIN: ");
            String vin = sc.nextLine();
            queue.offer(new Vehicle(type,brand,model,year,mileage,vin));
        }catch (InputMismatchException ex){
            ex.getMessage();
        }
    }


}

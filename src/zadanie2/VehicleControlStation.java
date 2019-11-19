package zadanie2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class VehicleControlStation {

    public static final int EXIT      = 0;
    public static final int ADD       = 1;
    public static final int CONTROLL  = 2;

    public static void main(String[] args) {
        Queue<Vehicle> queue = new LinkedList<>();
        queue.offer(new Vehicle("Car","Volvo","S60",2004,220000,"874xyz"));
        queue.offer(new Vehicle("Car","Aud","Rs4",2018,12000,"974xyz"));
        queue.offer(new Vehicle("Car","BMW","M5",2019,5000,"774xyz"));

        vehicleControll(queue);
    }

    private static void vehicleControll(Queue<Vehicle> queue) {
        Scanner sc = new Scanner(System.in);
        int option = -1;
        while (option != EXIT) {
            System.out.println("Dostępne opcje: ");
            System.out.println("0 - wyjście z programu");
            System.out.println("1 - dodanie pojazdu");
            System.out.println("2 - wyświetlenie");

            System.out.println("Wybierz opcję: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case ADD:
                    VehicleUtil.addVehicle(queue);
                    break;
                case CONTROLL:
                    System.out.println(queue.peek());
                    break;
                case EXIT:
                    System.out.println("Zamykam program!");
                    break;
                default:
                    System.out.println("Nie znaleziono takiej opcji");
            }
        }
        sc.close();
    }
}

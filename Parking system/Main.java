import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParkingLot parkingLot = new ParkingLot(5); // Create parking lot with 5 spots

        // Interactive part for backend (command line simulation)
        while (true) {
            System.out.println("1. Park Car");
            System.out.println("2. Vacate Spot");
            System.out.println("3. View Parking Lot");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Spot Number: ");
                    int spotNumber = scanner.nextInt();
                    System.out.print("Enter Vehicle Number: ");
                    String vehicleNumber = scanner.next();
                    parkingLot.parkCar(spotNumber, vehicleNumber);
                    break;
                case 2:
                    System.out.print("Enter Spot Number to Vacate: ");
                    int vacateSpot = scanner.nextInt();
                    parkingLot.vacateSpot(vacateSpot);
                    break;
                case 3:
                    System.out.println("Parking Lot Status:");
                    for (ParkingSpot spot : parkingLot.getParkingSpots()) {
                        System.out.println(spot);
                    }
                    break;
                case 4:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

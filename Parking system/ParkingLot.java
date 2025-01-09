import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpot> parkingSpots;

    public ParkingLot(int totalSpots) {
        parkingSpots = new ArrayList<>();
        for (int i = 1; i <= totalSpots; i++) {
            parkingSpots.add(new ParkingSpot(i));
        }
    }

    public void parkCar(int spotNumber, String vehicleNumber) {
        ParkingSpot spot = findSpotByNumber(spotNumber);
        if (spot != null && !spot.isOccupied()) {
            spot.occupy(vehicleNumber);
        }
    }

    public void vacateSpot(int spotNumber) {
        ParkingSpot spot = findSpotByNumber(spotNumber);
        if (spot != null && spot.isOccupied()) {
            spot.vacate();
        }
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    private ParkingSpot findSpotByNumber(int spotNumber) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.getSpotNumber() == spotNumber) {
                return spot;
            }
        }
        return null;
    }
}

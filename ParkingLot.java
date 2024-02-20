import java.util.*;
/**
 * This class acts as a collection of ParkingSpot elements.
 */

    public class ParkingLot {
    private List<ParkingSpot> parkingSpots = new ArrayList<>();

    // Add ParkingSpot to parking lot and populated different types of ParkingSpots
    public void addParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
    }

    // Implements the Visitor patter, accepts a ParkingSpotVisitor and applies to ParkingSpots.
    public void accept(ParkingSpotVisitor visitor) {
        for (ParkingSpot parkingSpot : parkingSpots) {
            parkingSpot.accept(visitor);
        }
    }
}
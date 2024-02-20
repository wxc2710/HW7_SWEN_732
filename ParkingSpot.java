/**
 * This interface declares a method that implements classes to interact with visitors.
 */
public interface ParkingSpot {
    void accept(ParkingSpotVisitor visitor);
}

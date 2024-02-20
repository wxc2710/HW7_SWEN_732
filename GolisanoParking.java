/**
 * This class is one of the objects in the Visitor pattern,
 * represents parking spots for Golisano students within the RIT campus
 */

public class GolisanoParking implements ParkingSpot {
    // This method points the visitors to perform operations specific to GolisanoParking spots.
    // it also takes the visitor to execute an operation for the parking class.
    @Override
    public void accept(ParkingSpotVisitor visitor) {
        visitor.visitGolisanoParking(this);
    }
}


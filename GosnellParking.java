/**
 * This class is one of the objects in the Visitor pattern,
 * represents parking spots for Gosnell students within the RIT campus
 */

public class GosnellParking implements ParkingSpot {
    // This method points the visitors to perform operations specific to GosnellParking spots.
    // it also takes the visitor to execute an operation for the parking class.
    @Override
    public void accept(ParkingSpotVisitor visitor) {
        visitor.visitGosnellParking(this);
    }
}

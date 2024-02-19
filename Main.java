// Main class that uses the Visitor pattern for a RIT parking system
// It contains  collection of ParkingSpots and uses FeeVisitor for calculation
public class Main {
    public static void main(String[] args) {

        // Populate parking lot
        ParkingLot parkingLot = new ParkingLot();

        // Add different types of parking spots
        parkingLot.addParkingSpot(new ResidentialParking());
        parkingLot.addParkingSpot(new CommuterParking());
        parkingLot.addParkingSpot(new GolisanoParking());
        parkingLot.addParkingSpot(new GosnellParking());

        // Visitor for calculating fee
        FeeVisitor feeCalculator = new FeeVisitor();

        // add to parking lot
        parkingLot.accept(feeCalculator);
    }
}
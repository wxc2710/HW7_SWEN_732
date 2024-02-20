/**
 * The ParkingSpotVisitor interface declares a set of visiting methods for different types
 * of parking spots within the RIT campus parking system.
 */

public interface ParkingSpotVisitor {

    // Methods to visit different parking spots
    void visitResidentialParking(ResidentialParking residentialParking);

    void visitCommuterParking(CommuterParking commuterParking);

    void visitGolisanoParking(GolisanoParking golisanoParking);

    void visitGosnellParking(GosnellParking gosnellParking);
}

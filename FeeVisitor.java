/**
 * This class includes methods for Golisano, Gosnell, Commuter, and Residential parking fee calculation
 */
public class FeeVisitor implements ParkingSpotVisitor {
    // Methods belows should contain logic for calculating fee for different parking spots
    @Override
    public void visitResidentialParking(ResidentialParking residentialParking) {
        System.out.println("Calculate fee for residential student parking.");
    }

    @Override
    public void visitCommuterParking(CommuterParking commuterParking) {
        System.out.println("Calculate fee for commuter student parking.");
    }

    @Override
    public void visitGolisanoParking(GolisanoParking golisanoParking) {
        System.out.println("Calculate fee for Golisano College parking.");
    }

    @Override
    public void visitGosnellParking(GosnellParking saundersParking) {
        System.out.println("Calculate fee for Saunders College parking.");
    }
}

# RIT Campus Parking System


The RIT Campus Parking System is an application designed to manage parking spots within the Rochester Institute of Technology (RIT) campus. Utilizing the Visitor Design Pattern, this system allows for the execution of various operations (such as fee calculation, availability checks, and maintenance assessments) across different types of parking spots without altering the parking spot classes themselves.

## Project Structure

- ParkingSpot.java: Interface for different types of parking spots.
- ResidentialParking.java, CommuterParking.java, GolisanoParking.java, GosnellParking.java: Concrete classes representing specific parking spot types.
- ParkingSpotVisitor.java: Interface defining visitor operations.
- FeeVisitor.java: A concrete visitor for calculating parking fees.
- ParkingLot.java: Manages a collection of parking spots and delegates visitor operations.
- Main.java: Demonstrates the application's functionality.

### Visitor Design Pattern

- **Purpose**: Using Visitor design pattern to allow the addition of new operations without modifying the objects.
- **Implementation**: This project implements the Visitor pattern through the ParkingSpotVisitor interface, enabling flexible operations on parking spots.

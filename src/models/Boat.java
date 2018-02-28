package models;

/**
 * 
 * @author Dan and Anders
 * Class description: Sub class for Vehicle class.
 *
 */
public class Boat extends Vehicle {
	
	private boolean hasToilet;
	private boolean hasSails;
	
	public Boat(String registrationNumber, String color, int numberOfSeats, String typeOfFuel, int numberOfEngines, boolean hasToilet, boolean hasSails) {
		super(registrationNumber, color, numberOfSeats, typeOfFuel, numberOfEngines);
		this.hasToilet = hasToilet;
		this.hasSails = hasSails;
	}
	
	
	
}

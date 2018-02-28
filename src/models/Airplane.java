package models;

/**
 * 
 * @author Dan and Anders
 * Class description: Sub class for Vehicle class.
 *
 */
public class Airplane extends Vehicle {
	
	private int numberOfWheels;
	private int numberOfDoors;
	
	public Airplane(String registrationNumber, String color, int numberOfSeats, String typeOfFuel, int numberOfEngines, int numberOfWheels, int numberOfDoors) {
		super(registrationNumber, color, numberOfSeats, typeOfFuel, numberOfEngines);
		this.numberOfWheels = numberOfWheels;
		this.numberOfDoors = numberOfDoors;
	}
	
	
}

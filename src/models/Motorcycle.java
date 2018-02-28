package models;

/**
 * 
 * @author Dan and Anders
 * Class description: Sub class for Vehicle class.
 *
 */
public class Motorcycle extends Vehicle {

	private int numberOfWheels;

	public Motorcycle(String registrationNumber, String color, int numberOfSeats, String typeOfFuel, int numberOfEngines, int numberOfWheels) {
		super(registrationNumber, color, numberOfSeats, typeOfFuel, numberOfEngines);
		this.numberOfWheels = numberOfWheels;
	}
	
}

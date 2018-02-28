package models;

/**
 * 
 * @author Dan and Anders
 * Class description: Sub class for Vehicle class.
 *
 */
public class Car extends Vehicle {

	private int numberOfWheels;
	private boolean retractableRoof;
	private int numberOfDoors;
	
	public Car(String registrationNumber, String color, int numberOfSeats, String typeOfFuel, int numberOfEngines, int numberOfWheels, boolean retractableRoof, int numberOfDoors) {
		super(registrationNumber, color, numberOfSeats, typeOfFuel, numberOfEngines);
		this.numberOfWheels = numberOfWheels;
		this.retractableRoof = retractableRoof;
		this.numberOfDoors = numberOfDoors;
	}
	
}

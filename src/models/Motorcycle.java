package models;

import utils.VehicleParking;

/**
 * 
 * @author Dan and Anders
 * Class description: Sub class for Vehicle class.
 *
 */
public class Motorcycle extends Vehicle {

	private int numberOfWheels;

	public Motorcycle(String registrationNumber, String color, int numberOfSeats, String typeOfFuel, int numberOfEngines, VehicleParking vehicleParking, int numberOfWheels) {
		super(registrationNumber, color, numberOfSeats, typeOfFuel, numberOfEngines, vehicleParking);
		this.numberOfWheels = numberOfWheels;
	}
	
	/**
	 * @return Returns vehicle's parking type
	 */
	@Override
	public VehicleParking getVehicleParking() {
		return VehicleParking.GARAGE;
	}
	
	
	@Override
	public String toString() {
		return "Motorcykle with regnumber " + getRegistrationNumber() + " is parking in the " + getVehicleParking() + ", [numberOfWheels=" + numberOfWheels + "]";
	}
}

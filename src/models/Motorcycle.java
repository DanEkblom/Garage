package models;

import utils.Parking;
import utils.VehicleParking;

/**
 * 
 * @author Dan and Anders
 * Class description: Sub class for Vehicle class.
 *
 */
public class Motorcycle extends Vehicle {

	private int numberOfWheels;

	public Motorcycle(String registrationNumber, String color, int numberOfSeats, String typeOfFuel, int numberOfEngines, VehicleParking vehicleParking, int numberOfWheels, Parking parked) {
		super(registrationNumber, color, numberOfSeats, typeOfFuel, numberOfEngines, vehicleParking, parked);
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
		return "Motorcycle with regnumber " + getRegistrationNumber() + " is parked in the " + getVehicleParking().toString().toLowerCase() + ".";
	}
}

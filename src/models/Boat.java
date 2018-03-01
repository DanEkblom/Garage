package models;

import utils.Parking;
import utils.VehicleParking;

/**
 * 
 * @author Dan and Anders
 * Class description: Sub class for Vehicle class.
 *
 */
public class Boat extends Vehicle {
	
	private boolean hasToilet;
	private boolean hasSails;
	
	public Boat(String registrationNumber, String color, int numberOfSeats, String typeOfFuel, int numberOfEngines, VehicleParking vehicleParking, boolean hasToilet, boolean hasSails, Parking parked) {
		super(registrationNumber, color, numberOfSeats, typeOfFuel, numberOfEngines, vehicleParking, parked);
		this.hasToilet = hasToilet;
		this.hasSails = hasSails;
	}
	
	/**
	 * @return Returns vehicle's parking type
	 */
	@Override
	public VehicleParking getVehicleParking() {
		return VehicleParking.HARBOR;
	}
	
	
	@Override
	public String toString() {
		return "Boat with regnumber " + getRegistrationNumber() + " is parking in the " + getVehicleParking() + "]";
	}
}

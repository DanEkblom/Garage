package models;

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
	
	public Boat(String registrationNumber, String color, int numberOfSeats, String typeOfFuel, int numberOfEngines, VehicleParking vehicleParking, boolean hasToilet, boolean hasSails) {
		super(registrationNumber, color, numberOfSeats, typeOfFuel, numberOfEngines, vehicleParking);
		this.hasToilet = hasToilet;
		this.hasSails = hasSails;
	}
	
	/**
	 * @return Returns vehicle's parking type
	 */
	@Override
	public VehicleParking getVehicleParking() {
		getVehicleParking();
		return VehicleParking.HARBOR;
	}
	
	
	
}

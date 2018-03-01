package models;

import utils.VehicleParking;

/**
 * 
 * @author Dan and Anders
 * Class description: Sub class for Vehicle class.
 *
 */
public class Airplane extends Vehicle {
	
	private int numberOfWheels;
	private int numberOfDoors;
	
	public Airplane(String registrationNumber, String color, int numberOfSeats, String typeOfFuel, int numberOfEngines, VehicleParking vehicleParking, int numberOfWheels, int numberOfDoors) {
		super(registrationNumber, color, numberOfSeats, typeOfFuel, numberOfEngines, vehicleParking);
		this.numberOfWheels = numberOfWheels;
		this.numberOfDoors = numberOfDoors;
	}
	
	/**
	 * @return Returns vehicle's parking type
	 */
	@Override
	public VehicleParking getVehicleParking() {
		getVehicleParking();
		return VehicleParking.HANGAR;
	}
	
	
}

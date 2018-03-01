package models;

import utils.VehicleParking;

/**
 * 
 * @author Dan and Anders
 * Class description: Sub class for Vehicle class.
 *
 */
public class Bus extends Vehicle {
	
	private int numberOfWheels;
	private int numberOfDoors;
	private int numberOfDecks;
	
	public Bus(String registrationNumber, String color, int numberOfSeats, String typeOfFuel, int numberOfEngines, VehicleParking vehicleParking, int numberOfWheels, int numberOfDoors, int numberOfDecks) {
		super(registrationNumber, color, numberOfSeats, typeOfFuel, numberOfEngines, vehicleParking);
		this.numberOfWheels = numberOfWheels;
		this.numberOfDoors = numberOfDoors;
		this.numberOfDecks = numberOfDecks;
	}
	
	/**
	 * @return Returns vehicle's parking type
	 */
	@Override
	public VehicleParking getVehicleParking() {
		getVehicleParking();
		return VehicleParking.GARAGE;
	}
	
	
}

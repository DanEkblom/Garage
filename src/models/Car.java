package models;

import models.Vehicle;
import utils.Parking;
import utils.VehicleParking;

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
	
	public Car(String registrationNumber, String color, int numberOfSeats, String typeOfFuel, int numberOfEngines, VehicleParking vehicleParking, int numberOfWheels, boolean retractableRoof, int numberOfDoors, Parking parked) {
		super(registrationNumber, color, numberOfSeats, typeOfFuel, numberOfEngines, vehicleParking, parked);
		this.numberOfWheels = numberOfWheels;
		this.retractableRoof = retractableRoof;
		this.numberOfDoors = numberOfDoors;
		
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
		return "Car with regnumber " + getRegistrationNumber() + " is parked in the " + getVehicleParking().toString().toLowerCase() + ".";
	}
	
	
	
}

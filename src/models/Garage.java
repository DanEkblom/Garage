package models;

import java.util.ArrayList;

import exceptions.VehicleNotFoundException;

/**
 * 
 * @author Dan and Anders
 * Class description: Collection class for Vehicle class subclasses, i.e. Car, Motorcycle, etc.
 *
 */
public class Garage {
	
	private ArrayList<Vehicle> vehicleArray;
	
	/**
	 * @param Sets array size to 10
	 */
	public Garage() {
		vehicleArray = new ArrayList<Vehicle>(10);
	}
	
	public ArrayList<Vehicle> getVehicleArray() {
		return vehicleArray;
	}
	
	/**
	 * @param Adds vehicle to garage
	 */
	public void parkVehicle(Vehicle vehicleToPark) {
		vehicleArray.add(vehicleToPark);
	}
	
	/**
	 * @param Removes vehicle from garage
	 */
	public void unparkVehicle(Vehicle vehicleToUnpark) throws VehicleNotFoundException // throws Exception
	{
		if (vehicleArray.contains(vehicleToUnpark)) {
			vehicleArray.remove(vehicleToUnpark);
		}
		else {
			throw new VehicleNotFoundException();
		}
		
	};
	
}

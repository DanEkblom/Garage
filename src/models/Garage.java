package models;

import java.util.ArrayList;

/**
 * 
 * @author Dan and Anders
 * Class description: Collection class for Vehicle class subclasses, i.e. Car, Motorcycle, etc.
 *
 */
public class Garage {
	
	private ArrayList<Vehicle> vehicleArray;
	
	public Garage() {
		vehicleArray = new ArrayList<Vehicle>(10);
	}
	
	public ArrayList<Vehicle> getVehicleArray() {
		return vehicleArray;
	}
	
	public void parkVehicle(Vehicle vehicleToPark) {
		vehicleArray.add(vehicleToPark);
	}
	
	public void unparkVehicle(Vehicle vehicleToUnpark) // throws Exception
	{
		if (vehicleArray.contains(vehicleToUnpark)) {
			vehicleArray.remove(vehicleToUnpark);
		}
		else {
			// Throws new Exception.
		}
		
	}
}

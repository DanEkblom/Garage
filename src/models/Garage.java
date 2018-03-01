package models;

import java.util.ArrayList;

import exceptions.VehicleGarageFullException;
import exceptions.VehicleNotFoundException;

/**
 * 
 * @author Dan and Anders
 * Class description: Collection class for Vehicle class subclasses, i.e. Car, Motorcycle, etc.
 *
 */
public class Garage {
	
	private ArrayList<Vehicle> vehicleArray;
	private int maxGarageSize;
	
	/**
	 * @param Sets array size to 10
	 */
	public Garage() {
		maxGarageSize = 10;
		vehicleArray = new ArrayList<Vehicle>(maxGarageSize);
	}
	
	public ArrayList<Vehicle> getVehicleArray() {
		return vehicleArray;
	}
	
	/**
	 * @param Adds vehicle to garage and throws an Exception when trying to park in a full garage.
	 */
	public void parkVehicle(Vehicle vehicleToPark) throws VehicleGarageFullException {
		if (vehicleArray.size() < maxGarageSize) { //getVehicleArray().size() < vehicleArray.size()
			vehicleArray.add(vehicleToPark);
		}
		else {
			System.out.println("Sorry. The garage is full. Vehicle can't be parked.");
		}
	}
	
	/**
	 * @param Removes vehicle from garage, and if vehicle can't be found an Exception will be thrown.
	 */
	public void unparkVehicle(Vehicle vehicleToUnpark) throws VehicleNotFoundException
	{
		if (vehicleArray.contains(vehicleToUnpark)) {
			vehicleArray.remove(vehicleToUnpark);
		}
		else {
			System.out.println("Sorry. Vehicle can't be found in the garage.\nAre you sure you've parked it?");
			throw new VehicleNotFoundException();
		}
		
	};
	
}

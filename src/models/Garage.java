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
	
	public Vehicle findVehicle(String vehicleNrToFindVehicle) throws VehicleNotFoundException 
	{

		Vehicle v = null;
		
		for (int i = 0; i < getVehicleArray().size(); i++)  
		{
			
			if(getVehicleArray().get(i).getRegistrationNumber().equals(vehicleNrToFindVehicle))
			{
				v = getVehicleArray().get(i);
				System.out.println("Vehicle was found");
			}
		}	
		return v;
		
	}

	
	/**
	 * @param Adds vehicle to garage and throws an Exception when trying to park in a full garage.
	 */
	public void parkVehicle(Vehicle vehicleToPark) throws VehicleGarageFullException {
		if (vehicleArray.size() < maxGarageSize) { 
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
			System.out.println("Sorry. Vehicle can't be found in the garage.\nAre you sure you've parked it?\n");
			throw new VehicleNotFoundException();
		}
		
	};
	
}

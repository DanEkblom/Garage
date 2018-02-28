package models;

/**
 * 
 * @author Dan and Anders
 * Class description: Collection class for Vehicle class subclasses, i.e. Car, Motorcycle, etc.
 *
 */
public class Garage {
	
	private Vehicle[] vehicleArray;
	private int nextPosition;
	
	public Garage() {
		vehicleArray = new Vehicle[10];
		nextPosition = 0;
	}
	
	public Vehicle[] getVehicleArray() {
		return vehicleArray;
	}
	
	public void parkVehicle(Vehicle vehicleToPark) {
		vehicleArray[nextPosition] = vehicleToPark;
		nextPosition++;
	}
	
	public void unparkVehicle(Vehicle regNumber) // throw Exception
	{
		for (int i = 0; i < nextPosition; i++) {
			if (vehicleArray[i].getRegistrationNumber().equals(regNumber)) {
				//
			}
			else {
				// throw new Exception
			}
			
		}
	}
}

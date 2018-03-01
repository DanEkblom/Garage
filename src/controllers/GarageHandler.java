package controllers;

import exceptions.VehicleGarageFullException;
import exceptions.VehicleNotFoundException;
import models.Airplane;
import models.Boat;
import models.Car;
import models.Garage;
import models.Motorcycle;
import models.Vehicle;
import utils.VehicleParking;

/**
 * 
 * @author Dan and Anders
 * Class description: Controller class for models and UI handling.
 *
 */
public class GarageHandler {
	
	Car car = new Car("BBB222", "white", 2, "diesel", 1, VehicleParking.GARAGE, 5, false, 4);
	Car car2 = new Car("AAA111", "black", 4, "gasoline", 1, VehicleParking.GARAGE, 4, false, 2);
	Boat boat = new Boat("B001", "silver", 6, "diesel", 2, VehicleParking.HARBOR, true, true);
	Motorcycle mc = new Motorcycle("MCC001", "red", 2, "gasoline", 1, VehicleParking.GARAGE, 2);
	Airplane airplane = new Airplane("AIR001", "blue", 120, "jetfuel", 4, VehicleParking.HANGAR, 3, 2);
	
	
	Garage garage = new Garage();
	
	public GarageHandler() {
		
		
		System.out.println(garage.getVehicleArray().size()); // 0
		
		
		try {
			garage.parkVehicle(car);
		}
		catch (VehicleGarageFullException e) {
		}
		
		try {
			garage.parkVehicle(car2);
		}
		catch (VehicleGarageFullException e) {	
		}
		
		try {
			garage.parkVehicle(boat);
		}
		catch (VehicleGarageFullException e) {	
		}
		
		try {
			garage.parkVehicle(mc);
		}
		catch (VehicleGarageFullException e) {
		}
		
		try {
			garage.parkVehicle(airplane);
		}
		catch (VehicleGarageFullException e) {
		}
	
		
		System.out.println(garage.getVehicleArray().size()); // 5
		
		
		for (int i = 0; i < garage.getVehicleArray().size(); i++) {
			System.out.println(garage.getVehicleArray().get(i));
		}
		
		try {
			System.out.println(garage.findVehicle("B001"));
		}
		catch (VehicleNotFoundException e) {
			// TODO: handle exception
		}
	}
	
	
	
	
	public Vehicle listAllParkedVehicles()
	{
		//Garage garage2 = new Garage();
		for (int i = 0; i < garage.getVehicleArray().size(); i++) {
			System.out.println(garage.getVehicleArray().get(i));
		}
		
		return null;
	}
	
	

}

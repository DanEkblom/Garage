package ui;

import exceptions.VehicleGarageFullException;
import exceptions.VehicleNotFoundException;
import models.Airplane;

//import java.util.Iterator;

import models.Boat;
import models.Car;
import models.Garage;
import models.Motorcycle;
//import models.Vehicle;
import utils.VehicleParking;

/**
 * 
 * @author Dan and Anders
 * Class description: Main class for executing the Garage application.
 *
 */
public class Main {

	public static void main(String[] args) {
		Car car = new Car("BBB222", "white", 2, "diesel", 1, VehicleParking.GARAGE, 5, false, 4);
		Car car2 = new Car("AAA111", "black", 4, "gasoline", 1, VehicleParking.GARAGE, 4, false, 2);
		Boat boat = new Boat("B001", "silver", 6, "diesel", 2, VehicleParking.HARBOR, true, true);
		Motorcycle mc = new Motorcycle("MCC001", "red", 2, "gasoline", 1, VehicleParking.GARAGE, 2);
		Airplane airplane = new Airplane("AIR001", "blue", 120, "jetfuel", 4, VehicleParking.HANGAR, 3, 2);
		
		
		Garage garage = new Garage();
		
		System.out.println(garage.getVehicleArray().size()); // 0
		
		/*
		garage.parkVehicle(car);
		garage.parkVehicle(car2);
		garage.parkVehicle(boat);
		garage.parkVehicle(mc);
		garage.parkVehicle(airplane);
		*/
		
		
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
		
		//System.out.println(garage.getVehicleArray().get(0).toString());
		//System.out.println(garage.getVehicleArray().get(1).toString());
		//System.out.println(garage.getVehicleArray().toString());
		
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

}

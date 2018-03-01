package controllers;
import java.util.Random;
import exceptions.VehicleGarageFullException;
import exceptions.VehicleNotFoundException;
import models.Airplane;
import models.Boat;
import models.Bus;
import models.Car;
import models.Garage;
import models.Motorcycle;
import models.Vehicle;
import utils.Parking;
import utils.VehicleParking;

/**
 * 
 * @author Dan and Anders
 * Class description: Controller class for models and UI handling.
 *
 */
public class GarageHandler {
	
//	Car car = new Car("BBB222", "white", 2, "diesel", 1, VehicleParking.GARAGE, 5, false, 4);
//	Car car2 = new Car("AAA111", "black", 4, "gasoline", 1, VehicleParking.GARAGE, 4, false, 2);
//	Boat boat = new Boat("B001", "silver", 6, "diesel", 2, VehicleParking.HARBOR, true, true);
//	Motorcycle motorcykle = new Motorcycle("MCC001", "red", 2, "gasoline", 1, VehicleParking.GARAGE, 2);
//	Airplane airplane = new Airplane("AIR001", "blue", 120, "jetfuel", 4, VehicleParking.HANGAR, 3, 2);
	
	
	Garage garage = new Garage();
	
	public GarageHandler() {
		
		
//		System.out.println(garage.getVehicleArray().size()); // 0
//		
//		
//		try {
//			garage.parkVehicle(car);
//		}
//		catch (VehicleGarageFullException e) {
//		}
//		
//		try {
//			garage.parkVehicle(car2);
//		}
//		catch (VehicleGarageFullException e) {	
//		}
//		
//		try {
//			garage.parkVehicle(boat);
//		}
//		catch (VehicleGarageFullException e) {	
//		}
//		
//		try {
//			garage.parkVehicle(motorcykle);
//		}
//		catch (VehicleGarageFullException e) {
//		}
//		
//		try {
//			garage.parkVehicle(airplane);
//		}
//		catch (VehicleGarageFullException e) {
//		}
//	
//		
//		System.out.println(garage.getVehicleArray().size()); // 5
//		
//		
//		for (int i = 0; i < garage.getVehicleArray().size(); i++) {
//			System.out.println(garage.getVehicleArray().get(i));
//		}
//		
//		try {
//			System.out.println(garage.findVehicle("B001"));
//		}
//		catch (VehicleNotFoundException e) {
//			// TODO: handle exception
//		}
	}
	
	
	
	
	public Vehicle listAllParkedVehicles()
	{
		//Garage garage2 = new Garage();
		for (int i = 0; i < garage.getVehicleArray().size(); i++) {
			System.out.println(garage.getVehicleArray().get(i));
		}
		System.out.println("----------------");
		return null;
	}
	
	public String getRandom() {
		
		int minimum = 0;
		int maximum = 10;
		int randomNum = minimum + (int)(Math.random() * maximum); 
		String num = String.valueOf(randomNum);
		return num;
		
	}
	
	public void createVehicle(String createVehicle) {
		switch(createVehicle){
	case "car": 
		Car car = new Car(getRandom() + getRandom() + getRandom() + getRandom(), "Black", 5, "Gasolin", 1, VehicleParking.GARAGE, 4, true, 4, Parking.PARKED);
		parkAVehicle(car);
		System.out.println(car);
		break;
	case "motorcykle": 
		Motorcycle motorcykle = new Motorcycle(getRandom() + getRandom() + getRandom() + getRandom(), "red", 2, "gasoline", 1, VehicleParking.GARAGE, 2, Parking.PARKED);
		System.out.println(motorcykle);
		break;
	case "airplane": 
		Airplane airplane = new Airplane(getRandom() + getRandom() + getRandom() + getRandom(), "blue", 120, "jetfuel", 4, VehicleParking.HANGAR, 3, 2, Parking.PARKED);
		System.out.println(airplane);
		break;
	case "boat": 
		Boat boat = new Boat(getRandom() + getRandom() + getRandom() + getRandom(), "silver", 6, "diesel", 2, VehicleParking.HARBOR, true, true, Parking.PARKED);
		System.out.println(boat);
		break;
	case "bus": 
		Bus bus = new Bus(getRandom() + getRandom() + getRandom() + getRandom(), "Yellow", 22, "Diesel", 1, VehicleParking.GARAGE, 8, 3, 1,Parking.PARKED);
		System.out.println(bus);
		break;
	default:
		break;
		}	
	}
	
	public void parkAVehicle(Vehicle vehicle){
		try {
			garage.parkVehicle(vehicle);
		}
		catch(VehicleGarageFullException e) {
			System.out.println("Parking Failed");
		}
	}
	
	
	/*
	public void parkVehicle(Vehicle typeOfVehicle) {
		switch (typeOfVehicle) {
		case car: 
			try {
			garage.parkVehicle(car);
			}
			catch(VehicleGarageFullException e) {
			}
			break;
		case "motorcykle": 
			
			break;
		case "airplane": 
			
			break;
		case "boat": 
			
			break;
		case "bus": 
			
			break;
		default:
			break;
		}
		
	}
	*/
	
	
	

}

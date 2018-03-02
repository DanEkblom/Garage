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
	
	Garage garage = new Garage();
	static String parkedVehicleSuccessful = "Vehicle has been checked in by customer.";
	
	public GarageHandler() {
	}
	
		
	
	public Vehicle listAllParkedVehicles()
	{
		for (int i = 0; i < garage.getVehicleArray().size(); i++) {
			System.out.println(garage.getVehicleArray().get(i));
		}
		return null;
	}
	
	
	public String getRandom() {
		int minimum = 0;
		int maximum = 10;
		int randomNum = minimum + (int)(Math.random() * maximum); 
		int randomNum1 = minimum + (int)(Math.random() * maximum); 
		int randomNum2 = minimum + (int)(Math.random() * maximum); 
		int randomNum3 = minimum + (int)(Math.random() * maximum); 
		String num = String.valueOf(randomNum) + String.valueOf(randomNum1) + String.valueOf(randomNum2) + String.valueOf(randomNum3);
		
		return num;
	}
	
	
	public void createVehicle(String createVehicle) {
		switch(createVehicle){
	case "car": 
		Car car = new Car(getRandom(), "Black", 5, "Gasolin", 1, VehicleParking.GARAGE, 4, true, 4, Parking.PARKED);
		parkAVehicle(car);
		System.out.println(parkedVehicleSuccessful);
		//System.out.println(car);
		break;
	case "motorcycle": 
		Motorcycle motorcycle = new Motorcycle(getRandom(), "red", 2, "gasoline", 1, VehicleParking.GARAGE, 2, Parking.PARKED);
		parkAVehicle(motorcycle);
		System.out.println(parkedVehicleSuccessful);
		//System.out.println(motorcykle);
		break;
	case "airplane": 
		Airplane airplane = new Airplane(getRandom(), "blue", 120, "jetfuel", 4, VehicleParking.HANGAR, 3, 2, Parking.PARKED);
		parkAVehicle(airplane);
		System.out.println(parkedVehicleSuccessful);
		//System.out.println(airplane);
		break;
	case "boat": 
		Boat boat = new Boat(getRandom(), "silver", 6, "diesel", 2, VehicleParking.HARBOR, true, true, Parking.PARKED);
		parkAVehicle(boat);
		System.out.println(parkedVehicleSuccessful);
		//System.out.println(boat);
		break;
	case "bus": 
		Bus bus = new Bus(getRandom(), "Yellow", 22, "Diesel", 1, VehicleParking.GARAGE, 8, 3, 1,Parking.PARKED);
		parkAVehicle(bus);
		System.out.println(parkedVehicleSuccessful);
		//System.out.println(bus);
		break;
	default:
		System.out.println("This type of vehicle is not allowed to be parked.");
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
	
	
	public void removeParkedVehicle(String vehicleRegNumber) {
		try {
			Vehicle findCar = garage.findVehicle(vehicleRegNumber);
			try {
				garage.unparkVehicle(findCar);
			}
			catch (VehicleNotFoundException e) {
				// TODO: handle exception
			}
		}
		 catch (VehicleNotFoundException e) {
			// TODO: handle exception
		}
		
	}
	
	public Vehicle findAVehicle(String vehicleRegNumber) throws VehicleNotFoundException {
		Vehicle findCar = garage.findVehicle(vehicleRegNumber);
		
		return findCar;
	}

}

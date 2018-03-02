package ui;

import java.util.Scanner;

import controllers.GarageHandler;
import exceptions.VehicleGarageFullException;
import exceptions.VehicleNotFoundException;
import exceptions.VehicleTypeNotAllowed;
import models.Airplane;

//import java.util.Iterator;

import models.Boat;
import models.Car;
import models.Garage;
import models.Motorcycle;
import models.Vehicle;
import utils.Parking;
//import models.Vehicle;
import utils.VehicleParking;

/**
 * 
 * @author Dan and Anders
 * Class description: Main class for executing the Garage application.
 *
 */
public class Main {
	
	//Create Garage
	private static GarageHandler gh = new GarageHandler();
	private static Scanner scanner = new Scanner(System.in);
	

	public static void callMenu() {
		System.out.println("CHOOSE ACTION BELOW: ");
		System.out.println("1: List all parked vehicles");
		System.out.println("2: Park a vehicle");
		System.out.println("3: Checkout a parked vehicle");
		System.out.println("4: Find a parked vehicle");
		System.out.println("5: Exit application");
		System.out.println("----------------------------");
		System.out.println("Enter number: ");
		
		int menuChoice = scanner.nextInt();
		
		switch (menuChoice) {
		case 1:
			// List all parked vehicles
			gh.listAllParkedVehicles();
			
			System.out.println("\n");
			callMenu();
			menuChoice = scanner.nextInt();
			
			break;
		case 2:
			// Park a vehicle
			System.out.println("Which type of vehicle? Airplane, Boat, Bus, Car or Motorcycle?");
			String vehicleToPark = scanner.next();
			gh.createVehicle(vehicleToPark.toLowerCase());
			
			System.out.println("\n");
			callMenu();
			menuChoice = scanner.nextInt();
			break;
		case 3:
			// Removes a parked vehicle
			System.out.println("Enter vehicle registration number: ");
			String vehicleRegNumber = scanner.next();
			gh.removeParkedVehicle(vehicleRegNumber);
			//System.out.println("Vehicle has been checked out by customer.\n");
			callMenu();
			menuChoice = scanner.nextInt();
			break;
		case 4:
			// Find a parked vehicle
			System.out.println("Enter vehicle registration number: ");
			String vehicleParkedRegNumber = scanner.next();
			try {
				System.out.println(gh.findAVehicle(vehicleParkedRegNumber));
			}
			catch (VehicleNotFoundException e) {
				System.out.println("No vehicle with that registration number was found.");
			}
			
			System.out.println("\n");
			callMenu();
			menuChoice = scanner.nextInt();
			break;
		case 5:
			// Exit application
			System.out.println("Application closed.");
			System.exit(0);
			//System.out.println("\n");
			//callMenu();
			//menuChoice = scanner.nextInt();
			break;	
		default:
			// Not a valid menu choice.
			System.out.println("Menu choice not found. Try another.\n");
			callMenu();
			menuChoice = scanner.nextInt();
			break;
	}
	}
	
	public static void main(String[] args) {

		/*
		Car car = new Car("BBB222", "white", 2, "diesel", 1, VehicleParking.GARAGE, 5, false, 4);
		Car car2 = new Car("AAA111", "black", 4, "gasoline", 1, VehicleParking.GARAGE, 4, false, 2);
		Boat boat = new Boat("B001", "silver", 6, "diesel", 2, VehicleParking.HARBOR, true, true);
		Motorcycle mc = new Motorcycle("MCC001", "red", 2, "gasoline", 1, VehicleParking.GARAGE, 2);
		Airplane airplane = new Airplane("AIR001", "blue", 120, "jetfuel", 4, VehicleParking.HANGAR, 3, 2);
		
		
		Garage garage = new Garage();
		
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
		
		
		*/
		
		/*
		Garage garage = new Garage();
		Car car = new Car("BBB222", "white", 2, "diesel", 1, VehicleParking.GARAGE, 5, false, 4,Parking.PARKED);
		Boat boat = new Boat("B001", "silver", 6, "diesel", 2, VehicleParking.HARBOR, true, true, Parking.PARKED);
		
		try 
		{
			garage.parkVehicle(car);
		}
		catch (VehicleGarageFullException e) 
		{
		}
		
		try 
		{
			garage.parkVehicle(boat);
		}
		catch (VehicleGarageFullException e) 
		{	
		}

		try 
		{
			 Vehicle findCar = garage.findVehicle("BBB222");
			
			
		}
		catch(VehicleNotFoundException e) 
		{
			
		}
*/
		
//		//Create Garage
//		GarageHandler gh = new GarageHandler();
		
		//Create Vehicles
		gh.createVehicle("car");
		gh.createVehicle("motorcykle");
		gh.createVehicle("boat");
		
		System.out.println("--------------------------");
		
		//List all parked Vehicles
		gh.listAllParkedVehicles();
		
		//Add a Vehicle and place it into garage
		gh.createVehicle("car");
		
		//List all parked Vehicles
		gh.listAllParkedVehicles();
	
		//Find and then Remove vehicles from garage
		//gh.removeParkedVehicle(vehicleRegNumber);
		
		
		// App startup welcome message
//		System.out.println("---------------------");
//		System.out.println("Welcome to OurGarage!");
//		System.out.println("---------------------");
//		System.out.println("Choose action below: ");
//		System.out.println("Press 1 to list all parked vehicles");
//		System.out.println("Press 2 to list all parked vehicle types");
//		System.out.println("Press 3 to park a vehicle");
//		System.out.println("Press 4 to checkout a parked vehicle");
//		System.out.println("Press 5 to find a parked vehicle");
//		System.out.println("---------------------");
		
		System.out.println("\n\n");
		System.out.println("----------------------------");
		System.out.println("Welcome to OurGarage!");
		System.out.println("----------------------------");
		
		callMenu();
		
//		Scanner scanner = new Scanner(System.in);
//		int menuChoice = scanner.nextInt();
		
//		switch (menuChoice) {
//			case 1:
//				gh.listAllParkedVehicles();
//				//System.out.println("Show menu? Yes/No");
//				
//				callMenu();
//				menuChoice = scanner.nextInt();
//				
//				break;
//			case 2:
//				// List all parked vehicle types, i.e. Car, Boat, Airplane etc.
//				break;
//			case 3:
//				// Park a vehicle
//				break;
//			case 4:
//				System.out.println("Enter vehicle registration number: ");
//				String vehicleRegNumber = scanner.next();
//				gh.removeParkedVehicle(vehicleRegNumber);
//				System.out.println("vehicle has been checked out by customer.");
//				break;
//			case 5:
//				// Find a parked vehicle
//				// gh.findAVehicle();
//				break;
//			default:
//				System.out.println("Menu choice not found. Try another.");
//				break;
//		}
				
		scanner.close();
		
	}

}

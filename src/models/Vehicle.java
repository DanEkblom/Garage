package models;

import utils.VehicleParking;

/**
 * 
 * @author Dan and Anders
 * Class description: Super class for all vehicle classes.
 *
 */
public class Vehicle {
	
	private String registrationNumber;
	private String color;
	private int numberOfSeats;
	private String typeOfFuel;
	private int numberOfEngines;
	private VehicleParking vehicleParking;
	
	public Vehicle(String registrationNumber, String color, int numberOfSeats, String typeOfFuel, int numberOfEngines, VehicleParking vehicleParking) {
		super();
		this.registrationNumber = registrationNumber;
		this.color = color;
		this.numberOfSeats = numberOfSeats;
		this.typeOfFuel = typeOfFuel;
		this.numberOfEngines = numberOfEngines;
	}

	/**
	 * @return the registrationNumber
	 */
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	/**
	 * @param registrationNumber the registrationNumber to set
	 */
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the numberOfSeats
	 */
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	/**
	 * @param numberOfSeats the numberOfSeats to set
	 */
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	/**
	 * @return the typeOfFuel
	 */
	public String getTypeOfFuel() {
		return typeOfFuel;
	}

	/**
	 * @param typeOfFuel the typeOfFuel to set
	 */
	public void setTypeOfFuel(String typeOfFuel) {
		this.typeOfFuel = typeOfFuel;
	}

	/**
	 * @return the numberOfEngines
	 */
	public int getNumberOfEngines() {
		return numberOfEngines;
	}

	/**
	 * @param numberOfEngines the numberOfEngines to set
	 */
	public void setNumberOfEngines(int numberOfEngines) {
		this.numberOfEngines = numberOfEngines;
	}
	
	/**
	 * @return the vehicleParking
	 */
	public VehicleParking getVehicleParking() {
		return vehicleParking;
	}
	
	@Override
	public String toString() {
		return "Vehicle with registrationNumber " + registrationNumber + " is " + color + ", seats "
				+ numberOfSeats + ", runs on " + typeOfFuel + " and has " + numberOfEngines + " engines.";
	}
	
	
}

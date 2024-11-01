package weerstand;

import java.util.Map;

public class Weerstand {
	// Creating attributes that will hold a string value
	private String stringBand1;
	private String stringBand2;
	private String stringBand3;
	
	// Creating a static hashmap with key-value pairs
	private static Map<String, Integer> weerstandLijst = Map.of(
			"z", 0,
			"b", 1,
			"r", 2,
			"o", 3,
			"g", 4,
			"G", 5,
			"B", 6,
			"V", 7,
			"L", 8,
			"W", 9
			);
	
	// Creating attributes that will hold the corresponding integer value -> perform calculations on
	private int intBand1;
	private int intBand2;
	private int intBand3;
	
	// Default constructor
	public Weerstand () {
		this.stringBand1 = "0";
		this.stringBand2 = "0";
		this.stringBand3 = "0";
		
	}
	
	// 1 parameter constructor
	public Weerstand (String abc) {
		// Using string method substring
		this.stringBand1 = abc.substring(0, 1);
		this.stringBand2 = abc.substring(1, 2);
		this.stringBand3 = abc.substring(2, 3);
		
		this.intBand1 = weerstandLijst.get(stringBand1);
		this.intBand2 = weerstandLijst.get(stringBand2);
		this.intBand3 = weerstandLijst.get(stringBand3);
	}
	
	// Instance method
	public double berekenWeerstand () {
		return ((10*this.intBand1 + this.intBand2) * Math.pow(10,this.intBand3));
	}
}

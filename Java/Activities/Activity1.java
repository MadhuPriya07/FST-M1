package activities;

import java.util.HashMap;
import java.util.LinkedList;

class Car {
	   
	String color="Red";
	String transmission="Manual";
	int make=2019;
	int tyres;
	int doors;
	
	 Car(int tyre,int doors){
		this.tyres=tyre;
		this.doors=doors;
	}
	 
	 void displayCharacteristics() {
		 System.out.println("Color of the Car is: "+color);
		 System.out.println("Transmission of the car is: "+ transmission);
		 System.out.println("Make of the car is: "+ make);
		 System.out.println("Tyres in the car is: "+ tyres);
		 System.out.println("Doors in the car is: "+doors);
	 }
	 
	 void accelarate() {
		 System.out.println("Car is moving forward");
	 }
	 void brake() {
		 System.out.println("Car has stopped.");
	 }
}

public class Activity1 {

	public static void main(String[] args) {
		Car obj= new Car(4,4);
		String s= "Spring is coming";
		String d= s.toLowerCase();
		
		char[] q=d.toCharArray();
		HashMap<Character,Integer> map= new HashMap<>();
		for(char v:q) {
			if(map.containsKey(v)) {
				map.put(v, map.get(v)+1);
			}
			else {
				map.put(v, 1);
			}
		}
		for(char c:map.keySet()){
			if(map.get(c)>1) {
				System.out.println(c);
			}
		}
		
	}
}

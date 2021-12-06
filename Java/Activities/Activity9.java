package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		ArrayList<String> myList= new ArrayList<>();
		myList.add("Tina");
		myList.add("Seeta");
		myList.add("Geeta");
		myList.add("Papon");
		myList.add("Kirti");
		
		for(String h:myList) {
			System.out.println(h);
		}
		
		System.out.println("Third Name in my List is: "+myList.get(2));
		
		if(myList.contains("Kirti")) {
			System.out.println("Kirti is there in my List");
		}
		
		System.out.println("My list contains "+myList.size()+" names");
		
		myList.remove(4);
		
		//After removing a name list contains
		System.out.println("After removing Kirti, my List now contains "+myList.size()+" names");
		

	}

}

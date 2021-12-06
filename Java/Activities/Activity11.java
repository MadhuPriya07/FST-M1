package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> colors= new HashMap();
		colors.put(1, "Yellow");
		colors.put(2, "Pink");
		colors.put(3, "Mustard");
		colors.put(4, "Peach");
		colors.put(5, "Indigo");
		
		System.out.println(colors);
		
		colors.remove(3);
		
		if(colors.containsValue("Green")) {
			System.out.println("Greens is there in the Map");
		}
		else {
			System.out.println("Green not present in the Map");
		}
		
		System.out.println("Size of the map is: "+colors.size());
	}

}

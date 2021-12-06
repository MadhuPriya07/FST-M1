package activities;

import java.util.HashSet;
import java.util.Iterator;

public class Activity10 {

	public static void main(String[] args) {
		HashSet hs= new HashSet();	
		hs.add("Delhi");
		hs.add(1);
		hs.add("Qutab Minar");
		hs.add(234);
		hs.add("I love India");
		hs.add(007);
		
		System.out.println("Size of the Hashset is: "+hs.size());
		
		hs.remove(234);
		
		if(hs.remove(2)) {
			System.out.println("Removed 2 Successfully");
		}
		else {
			System.out.println("2 is not there in the set");
		}
		
		if(hs.contains("Delhi")) {
			System.out.println("Welcome to Delhi");
		}
		System.out.println(hs.size());
		Iterator itr= hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

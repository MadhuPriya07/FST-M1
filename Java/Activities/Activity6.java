package activities;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Activity6 {
	
 public static void main(String[] args) throws InterruptedException {
	Plane obj= new Plane(10);
	String[] arr = { "Aston Martin", "Bugatti", "Bentley", "Alfa Romeo", "Buick", "Acura","Madhu","Mini","Gini","Ashu"};
	List<String> ob=Arrays.asList(arr);
	obj.onboard(ob);
	System.out.println(obj.takeOff());
	System.out.println(obj.getPassangers());
	Thread.sleep(40000);
	obj.land();
	System.out.println(obj.getLastTimeLander());
}
}

 class Plane {
	private List<String> passengers;
	private int maxPassangers;
	private Date LastTimeTookOff;
	private Date LastTimeLanded;
	
	Plane(int maxPassangers){
		this.passengers= new LinkedList<>();
		this.maxPassangers=maxPassangers;
		
	}
	public void onboard(List<String> passengers) {
		this.passengers.addAll(passengers);
		
	}
	public Date takeOff() {
		this.LastTimeTookOff= new Date();
		return this.LastTimeTookOff;	
	}
	public void land() {
		Date date = new Date();
		this.LastTimeLanded=date;
		this.passengers.clear();
	}
	
	public Date getLastTimeLander() {
		return this.LastTimeLanded;
	}
	public List<String> getPassangers(){
		return this.passengers;
	}
}

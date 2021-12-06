package activities;


interface BicycleParts{
	public int gear=0;
	public int speed=0;
}

interface BicycleOperations{
	public void applyBrake(int decrement);
	public void speedUp(int increment);
}

 class Cycle implements BicycleParts,BicycleOperations{

	 public int gear;
	 public int speed;
	 Cycle(int gear,int speed){
		 this.gear=gear;
		 this.speed=speed;
	 }
	@Override
	public void applyBrake(int decrement) {
		this.speed=this.speed-decrement;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		this.speed=this.speed+increment;
		
	}
	public String bicycleDesc() {
		return ("No of gears are: "+ this.gear+"\n Speed of bicycle is: "+this.speed);
	}
	
}

 class MountainBike extends Cycle{
	 public int seatHeight;
	 
	 MountainBike(int gear, int speed, int seatHeight) {
		super(gear, speed);
		this.seatHeight=seatHeight;
		}
	 public void setHeight(int value) {
		 this.seatHeight=value;
		 
	 }
	 public String bicycleDesc() {
		 return ("No of gears are: "+ this.gear+"\n Speed of MotorBike is: "+this.speed+"\n SeatHeight of Motorbike is: "+this.seatHeight);
	 }
 }
 
 public class Activity7 {
 public static void main(String[] args) {
	 
	 MountainBike obj= new MountainBike(6, 23, 2);
	 obj.applyBrake(4);
	 obj.speedUp(5);
	 obj.setHeight(5);
	System.out.println(obj.bicycleDesc()); 
	
}
}

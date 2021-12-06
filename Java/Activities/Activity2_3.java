package activities;

public class Activity2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,77,10,54,-10,10};
		int sumOf10=0;
		for(int b:a) {
			if(b==10) {
				sumOf10=sumOf10+10;
			}
		}
		
		if(sumOf10==30) {
			System.out.println("Pass the test");
		}
		else {
			System.out.println("Failed the test");
		}
		activity3(1000000000);
	}
	
	public static void activity3(double seconds) {
		
		double ValueInYears=seconds/31557600;
		System.out.println(ValueInYears);
		
	}

}

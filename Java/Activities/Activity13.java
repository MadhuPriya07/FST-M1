package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
	
	

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		ArrayList list= new ArrayList();
		Random indexgen= new Random();
		
		System.out.print("Enter Integer Please");
		System.out.println("(EOF or non-integer to terminate): ");
		
        while(scan.hasNextInt()) {
        	
            list.add(scan.nextInt());
	
        }
        Object[] nums = list.toArray();
        int index = indexgen.nextInt(nums.length);
    	
        System.out.println("Index value generated: " + index);
	
        System.out.println("Value in arary at generated index: " + nums[index]);
	
         scan.close();
	}

}

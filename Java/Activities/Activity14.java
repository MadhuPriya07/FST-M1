package activities;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class Activity14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file= new File("src/activities/newfile.txt");
			boolean fstatus= file.createNewFile();
			
			if(fstatus) {
				System.out.println("File Created Succesfully");
			}
			else {
				System.out.println("File already exists in the path");
			}
			
			//Catch the instance of the file
			// File fileUtil = FileUtils.getFile("src/session4/newfile.txt");
					
		}
		catch(Exception e) {
			
		}
	}

}

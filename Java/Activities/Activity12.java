package activities;

 interface Addable{
	 int add(int num1,int num2) ;
}

public class Activity12 {

	public static void main(String[] args) {
			
		
		Addable obj=(num3,num2)-> (num3+num2);
        System.out.println(obj.add(12,34));	

	}

}

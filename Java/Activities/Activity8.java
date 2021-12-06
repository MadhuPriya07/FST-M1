package activities;

public class Activity8 {

	public static void main(String[] args) {
		try {
		exceptionTest("Heloo how are you");
		}
		catch(CustomException esm) {
			System.out.println(esm.getMessage());
		}
	}
	
	static void exceptionTest(String str) throws CustomException {
		
			if(str!=null) {
			System.out.println(str);
			}
			else {
				throw new CustomException("String Value is Null");
			}
	}

}

class CustomException extends Exception{
	private String message;
	CustomException(String message){
		this.message=message;
	}
	
	
	public String getMessage() {
		
		return this.message;
		
	}
}

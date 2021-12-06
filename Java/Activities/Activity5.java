package activities;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBook newNovel= new MyBook();
		newNovel.setTitle("Harry Potter");
		System.out.println(newNovel.getTitle()); 
		
	}

}

abstract class Book{
	String title;
	
	abstract void setTitle(String title);
	
	String getTitle() {
		
		return this.title;
		
	}
}

class MyBook extends Book{

	@Override
	void setTitle(String title) {
		super.title=title;
		
	}
	
}

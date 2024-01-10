package util;

public class Step {

	public void display(String str) {
		System.out.println(str);
	}
	
	public void getData() {
		System.out.println("Country: USA");
		System.out.println("State: VA" );
		System.out.println("City: Reston");

		//added.. zipcode..
		System.out.println("Zipcod:1234");
		
		//added continent
		
		System.out.println("Continent: North America");
		System.out.println("Name");
		
	
		 
	}
	//method Added by Mebrat...
	public  boolean daysOfTheWeek(String isToday) {
		boolean result=false;
		if(isToday=="Monday"){
			result=true;
		}
		return result;
	}
}

package Class_Mod4;

public class Bill {

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double cover() {
		
		if (feeding()> 30.00){
			return 0.00;
		}
		else {
			
			return 4.00;
		}
	}
	
	public double feeding() {
		
		return beer*5.00 + softDrink*3.00 + barbecue*7.00;
	}
	
	public double ticket() {
		
		if (gender == 'F') {
			return 8.00;
		}
		else {
			return 10.00;
		}
		
	}
	
	public double total () {
		return feeding()+cover()+ticket();
	}
	
}

package Question;
import java.util.Scanner;
class CityNotFound extends Exception{
	public CityNotFound(String msg) {
		super(msg); 
	}
}
public class City {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long zipCode[] = {121103,122343,384613,238163}; 
		System.out.print("Enter Your City Zip Code : ");
		long code = sc.nextLong(); 
		try {
			findCityByZipCode(code,zipCode);
		}catch(CityNotFound e) {
			System.out.println("Sorry ! Your City Code is Not available in our database.");
			
		}
		sc.close();

	}

	static void findCityByZipCode(long zip, long zipCode[]) throws CityNotFound 
	{
		
		long code = 0; 
		for(int i=0; i<zipCode.length;i++) 
		{
			if(zipCode[i] == zip) {
				code = zipCode[i]; 
			}
		}
		if(code != zip) {
			throw new CityNotFound("City Not Found..."); 
		}
		else
		{
			System.out.println("Your CityCode is match in our database.");
		}
		
	}
	
}

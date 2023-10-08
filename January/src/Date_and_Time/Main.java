package Date_and_Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*; 
public class Main {

	public static void main(String[] args) {
				
		Date today = new Date(); 
		
		System.out.println(today);
		System.out.println();
		
		LocalDate ld = LocalDate.now(); 
		System.out.println(ld);
		
		LocalDate ob = LocalDate.of(2023, 5, 4); 
		System.out.println(ob);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDateTime other = LocalDateTime.of(2022,3,15,17,23,10);
		System.out.println(other);
		
		LocalTime tl = LocalTime.from(other); 
		System.out.println(tl);
		
	}

}

package zadaci_08_02_2016;
import java.math.BigDecimal;
public class DjeljivoSaDvaIliTRi {

	public static void main(String[] args) {


			
		 String brojString ="";
	     // creating a 50 digit decimal number
	     for (int i = 0; i < 49; i++) {

	    	 brojString += 0;
	     }
	     brojString =brojString+"1";
	    

	     BigDecimal decimalni = new BigDecimal(brojString);
	 
	     int brojac = 0;
	     while (brojac < 10) {

	         // check if huge number if divisible by 2 of 3
	         BigDecimal remainder2 = decimalni.remainder(new BigDecimal(2));
	         BigDecimal remainder3 = decimalni.remainder(new BigDecimal(3));
	         if (remainder2.equals(BigDecimal.ZERO) || remainder3.equals(BigDecimal.ZERO)) {
	        	 brojac++;
	        
	             System.out.println(brojac +": "+ decimalni);
	            
	         }
	         decimalni = decimalni.add(new BigDecimal(brojString));
	     }



	}

}

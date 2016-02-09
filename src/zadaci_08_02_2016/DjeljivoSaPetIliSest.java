package zadaci_08_02_2016;

import java.math.BigDecimal;

public class DjeljivoSaPetIliSest {

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

	         // check if huge number if divisible by 5 of 6
	         BigDecimal remainder5 = decimalni.remainder(new BigDecimal(5));
	         BigDecimal remainder6 = decimalni.remainder(new BigDecimal(6));
	         if (remainder5.equals(BigDecimal.ZERO) || remainder6.equals(BigDecimal.ZERO)) {
	        	 brojac++;
	        
	             System.out.println(brojac +": "+ decimalni);
	            
	         }
	         decimalni = decimalni.add(new BigDecimal(brojString));
	     }



		}

	}



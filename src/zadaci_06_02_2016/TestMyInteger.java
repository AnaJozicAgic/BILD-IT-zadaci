package zadaci_06_02_2016;

public class TestMyInteger {

	public static void main(String[] args) {
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);

			//testing methods of MyInteger class
			System.out.println("Unesite vrijednost prvog MyInteger objekta: ");
			int value1=input.nextInt();
			System.out.println("Unesite vrijednost drugog MyInteger objekta: ");
			int value2=input.nextInt();
				MyInteger prviObjekat = new MyInteger(value1);
				MyInteger drugiObjekat = new MyInteger(value2);
				System.out.println("Unesena vrijednost prvog objekta je: "+ prviObjekat.getValue());
				System.out.println("Unesena vrijednost drugog objekta je: "+ drugiObjekat.getValue());
				System.out.println("Unesite vrijednost za provjeru jednakosti sa prvim objektom: ");
				System.out.println("Prvi objekat je jednak unesenoj vrijednosti : "+prviObjekat.equals(input.nextInt()));
				System.out.println("Prvi objekat je jednak drugom objektu: "+prviObjekat.equals(drugiObjekat));
				System.out.println("Prvi objekat je paran broj: "+prviObjekat.isEven());
				System.out.println("Prvi objekat je neparan broj: "+prviObjekat.isOdd());
				System.out.println("Prvi objekat je primarni broj: "+prviObjekat.isPrime());

			    char c[]={'5','3','3'};
			   
				System.out.println(MyInteger.parseInt(c));
				System.out.println("Unesite String za pretvorbu : ");
				String unos2 = input.next();
				System.out.println("vrijednost unesenog stringa je:" + MyInteger.parseInt(unos2));
				System.out.println("Unesite broj koji zelite provjeriti da li je paran: ");
				System.out.println("Broj je paran : "+ MyInteger.isEven(input.nextInt()));
				System.out.println("Unesite broj koji zelite provjeriti da li je neparan: ");
				System.out.println("Broj je neparan : "+ MyInteger.isOdd(input.nextInt()));
				System.out.println("Unesite broj koji zelite provjeriti da li je primarni : ");
				System.out.println("Broj je primaran : "+ MyInteger.isPrime(input.nextInt()));
				input.close();
		} catch (Exception e) {
			System.out.println("Doslo je d ogreske. ");
			main(args);
		}
				

	}

}

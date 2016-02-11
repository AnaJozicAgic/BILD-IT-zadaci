package zadaci_10_02_2016;

public class TestPerson {

	public static void main(String[] args) {
		// person object
		Person a = new Person();
		a.setName("Amila");
		a.setPhoneNumber("123");
		a.setAdres("Jelah");
		a.setEmailAdres("amila@nesto.ba");
		System.out.println(a.toString());
		System.out.println();
		// Employee object
		Person b = new Employee(true, "5000", new MyDate(System.currentTimeMillis()));
		b.setName("Amila");
		b.setPhoneNumber("123");
		b.setAdres("Jelah");
		b.setEmailAdres("amila@nesto.ba");
		System.out.println(b.toString());
		System.out.println();
		// FAculty object
		Employee d = new Faculty(8, "Full professor");
		d.setName("Amila");
		d.setPhoneNumber("123");
		d.setAdres("Jelah");
		d.setEmailAdres("amila@nesto.ba");
		d.setDateHyred(new MyDate(System.currentTimeMillis()));
		d.setSallery("2000");
		d.setOfice(true);
		System.out.println(d.toString());
		System.out.println();
		// Staff object
		Employee e = new Staff("Cleaning Staf");
		System.out.println(e.toString());
		System.out.println();
		// student object
		Person c = new Student(2);
		c.setName("Amila");
		c.setPhoneNumber("123");
		c.setAdres("Jelah");
		c.setEmailAdres("amila@nesto.ba");
		System.out.println(c.toString());
		System.out.println();

	}

}

package zadaci_18_02_2016;



public class TestMyStack {

	public static void main(String[] args) {
		//New my stack object
		MyStack a = new MyStack();
		//Pushing elements to the stack
		for (int i=1; i<20; i++){
			a.push(i);
		}
	//deep copy elements and print for the user
	try {
		while(!a.clone().isEmpty()){
			System.out.println(a.clone().pop());
		}
	} catch (CloneNotSupportedException e) {
		System.out.println("Doslo je do greske.");
	}
	}

}

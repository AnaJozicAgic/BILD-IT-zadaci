package zadaci_05_02_20116;

public class TestFan {

	public static void main(String[] args) {
		// First object of the Fan class (speed Fast,radius 10, color yellow, Is
		// on)
		Fan prvi = new Fan();
		prvi.setSpeed(Fan.FAST);
		prvi.setRadius(10);
		prvi.setCollor("yellow");
		prvi.setOn(true);
		// Second object of the Fan class (speed Medium,radius 5, color blue, Is
		// of)
		Fan drugi = new Fan();
		drugi.setSpeed(Fan.MEDIUM);
		System.out.println(prvi.toString() + "\n" + drugi.toString());
	}

}

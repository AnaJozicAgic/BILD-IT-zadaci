package zadaci_18_02_2016;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

	public ComparableCircle() {
		super();
	}
	@Override
	public int compareTo(ComparableCircle o) {
		
		return 0;
	}
	//Method for comparing 
	public static ComparableCircle max (ComparableCircle a, ComparableCircle b){
		if(a.compareTo(b)==-1){
			return a;
		}else {
			return b;
		}
	}
	

}

package day3.Assignment;

public class MarutiDemo extends CarDemo {


	@Override
	public void model() {
		System.out.println("Model no. is Maruti 800");
	}

	@Override
	public void color() {
		System.out.println("Coclor is off white");
		
	}
	
public static void main(String[] args) {
	
	MarutiDemo M1= new MarutiDemo();
	int S1= M1.speed=100;
	System.out.println("Speed of Maruti is:"+ S1);
	M1.color();
	M1.model();	
	}

}

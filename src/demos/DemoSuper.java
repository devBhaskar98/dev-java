package demos;

class AS {
	int speed = 10;
	
	String showSpeed() {
		return String.valueOf(speed) ;
	}
}

public class DemoSuper extends AS{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoSuper demo = new DemoSuper();
		
		System.out.println("demo.showSpeed" + demo.showSpeed()); // 10
		
		AS as = new AS();
		as.speed = 20;
		
		System.out.println("demo.showSpeed" + demo.showSpeed()); // 10
		System.out.println("demo.getSpeed" + demo.getSpeed()); // 10
		System.out.println("as.showSpeed" + as.showSpeed()); // 20
	}
	
	String getSpeed() {
		return super.showSpeed();
	}

}

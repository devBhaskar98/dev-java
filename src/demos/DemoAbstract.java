package demos;

abstract class CarAb {
	int speed = 10;

	int getSpeed() {
		return this.speed;
	}

	abstract int setSpeed(int diffSpeed);
}

public class DemoAbstract extends CarAb {

	int speed = 20;

	public static void main(String[] args) {

		DemoAbstract demo = new DemoAbstract();

		System.out.println(demo.setSpeed(10));

	}

	@Override
	int setSpeed(int diffSpeed) {
		// TODO Auto-generated method stub
		return super.speed += diffSpeed;
	}

}

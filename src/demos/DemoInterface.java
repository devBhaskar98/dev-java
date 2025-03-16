package Demos;

interface Car {
	void turnRight();

	void turnLeft();

	default void goForward() {
		System.out.println("Going Forward");
	}

	default void goBack() {
		System.out.println("Going Backward");
	};
}

public class DemoInterface implements Car {

	public static void main(String[] args) {
		DemoInterface demo = new DemoInterface();

		demo.turnLeft();

	}

	@Override
	public void turnRight() {
		System.out.println("take Right");
		goForward();

	}

	@Override
	public void turnLeft() {
		System.out.println("take left");
		goForward();
		goBack();

	}

	@Override
	public void goBack() {
		System.out.println("Going Back");
	}

}

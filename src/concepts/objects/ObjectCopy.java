package concepts.objects;

class MyObject {
	int data;
	int globalData;
}

public class ObjectCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyObject obj1 = new MyObject();
		obj1.globalData = 10;

//		System.out.println("running");
		System.out.println("globaldata obj1 " + obj1.globalData);

		MyObject obj2 = new MyObject();

		obj1.globalData = 30;
		obj2 = obj1;
		obj2.globalData = 20;

		System.out.println("globaldata obj1 " + obj1.globalData);

	}

}

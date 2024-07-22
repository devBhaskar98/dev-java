package designpatterns.servicelocatorpattern;

public class DemoServiceLocatorPattern {

	public static void main(String[] args) {
		Service service = ServiceLocator.getService("ServiceA");
        service.execute();

        service = ServiceLocator.getService("ServiceB");
        service.execute();

        service = ServiceLocator.getService("ServiceA");
        service.execute();

        service = ServiceLocator.getService("ServiceB");
        service.execute();

	}

}

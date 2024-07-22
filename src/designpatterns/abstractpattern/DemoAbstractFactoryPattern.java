package designpatterns.abstractpattern;

public class DemoAbstractFactoryPattern {

	private static Application configureApplication() {
        Application app;
        GUIFactory factory;

        // Determine the current operating system
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }

}

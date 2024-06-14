package concepts.exceptionHandling;

public class DemoException {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();



		try {
            // Throw an object of user defined exception
			cart.isCheckoutReady(-1);
        }
        catch (ShoppingCartEmptyException ex) {
            System.out.println("Caught");

            // Print the message from MyException object
            System.out.println(ex.getMessage());
        }

	}

}
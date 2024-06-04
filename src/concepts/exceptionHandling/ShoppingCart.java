package concepts.exceptionHandling;

public class ShoppingCart {

	boolean isCheckoutReady(int orderCount) throws ShoppingCartEmptyException {
		if(orderCount<0) {
			throw new ShoppingCartEmptyException("Shopping Cart is empty");
		}
		System.out.println("Ready to checkout!!!");
		return true;
	}
}

package designpatterns.servicelocatorpattern;

public class InitialContext {
    public Object lookup(String jndiName) {
        if (jndiName.equalsIgnoreCase("ServiceA")) {
            System.out.println("Looking up and creating a new ServiceA object");
            return new ServiceA();
        } else if (jndiName.equalsIgnoreCase("ServiceB")) {
            System.out.println("Looking up and creating a new ServiceB object");
            return new ServiceB();
        }
        return null;
    }
}

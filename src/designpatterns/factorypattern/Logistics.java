package designpatterns.factorypattern;

//Creator
public abstract class Logistics {
 // Factory Method
 public abstract Transport createTransport();

 public void planDelivery() {
     // Use the factory method to create a Transport object
     Transport transport = createTransport();
     transport.deliver();
 }
}

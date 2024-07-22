package designpatterns.factorypattern;

//Concrete Creator - Sea Logistics
public class SeaLogistics extends Logistics {
 @Override
 public Transport createTransport() {
     return new Ship();
 }
}
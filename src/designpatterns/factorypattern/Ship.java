package designpatterns.factorypattern;

//Concrete Product - Ship
public class Ship implements Transport {
 @Override
 public void deliver() {
     System.out.println("Delivering by sea in a ship.");
 }
}
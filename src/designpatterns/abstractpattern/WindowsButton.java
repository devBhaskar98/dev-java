package designpatterns.abstractpattern;

//Concrete Product for Windows Button
public class WindowsButton implements Button {
 @Override
 public void paint() {
     System.out.println("Rendering a button in Windows style.");
 }
}

package designpatterns.abstractpattern;

//Concrete Product for Mac Checkbox
public class MacCheckbox implements Checkbox {
 @Override
 public void paint() {
     System.out.println("Rendering a checkbox in Mac style.");
 }
}

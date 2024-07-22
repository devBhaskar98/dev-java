package designpatterns.abstractpattern;

//Concrete Product for Windows Checkbox
public class WindowsCheckbox implements Checkbox {
 @Override
 public void paint() {
     System.out.println("Rendering a checkbox in Windows style.");
 }
}
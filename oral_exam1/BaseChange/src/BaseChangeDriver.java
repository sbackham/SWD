import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;

public class BaseChangeDriver {
    public static void main(String[] args){
        String number = JOptionPane.showInputDialog("What is the number?");
        String givenBase = JOptionPane.showInputDialog("What is the base?");
        String desiredBase = JOptionPane.showInputDialog("What base do you want to change to?");

        int number1 = Integer.parseInt(number);
        int givenBaseNumber = Integer.parseInt(givenBase);
        int desiredBaseNumber = Integer.parseInt(desiredBase);
        int newNumber= 0;

        JOptionPane.showMessageDialog(null, "The number with base changed to " + desiredBaseNumber
        "is " + newNumber);

    }
}


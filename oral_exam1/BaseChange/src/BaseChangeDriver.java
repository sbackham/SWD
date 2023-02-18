import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;

public class BaseChangeDriver {
    public static void main(String[] args){
        String number = JOptionPane.showInputDialog("What is the number?");
        String givenBase = JOptionPane.showInputDialog("What is the base?");
        String desiredBase = JOptionPane.showInputDialog("What base do you want to change to?");

        String number1 = number;
        String givenBaseNumber = givenBase;
        String desiredBaseNumber = desiredBase;
        String newNumber= " ";

        if (givenBaseNumber != "10"){
            newNumber = BaseChangeGUI.anyBaseToDecimal(number, givenBaseNumber);
            newNumber = BaseChangeGUI.decimalToOtherBase(newNumber, desiredBaseNumber);
        }
        else{
            newNumber = BaseChangeGUI.decimalToOtherBase(number, desiredBaseNumber);
        }


        JOptionPane.showMessageDialog(null, number1 + " with base of " + givenBaseNumber +
                " is changed to " + newNumber + " with base " + desiredBaseNumber);
    }
}


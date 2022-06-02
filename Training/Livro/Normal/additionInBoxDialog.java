package Training.Livro.Normal;
import javax.swing.JOptionPane;
import java.lang.Integer;

// Using dialog boxes to display on screen
public class additionInBoxDialog {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Enter first value:");
        String num2 = JOptionPane.showInputDialog("Enter second value:");
        String message;
        int  sum ;

        sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        message = String.format("%s + %s = %d",num1, num2, sum);
        JOptionPane.showMessageDialog(null, message);   
    }
}
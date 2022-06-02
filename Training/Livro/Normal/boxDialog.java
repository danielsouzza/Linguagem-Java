package Training.Livro.Normal;
import javax.swing.JOptionPane;

public class boxDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("what is your name?");
        String message = String.format("welcome, %s, to programming", name);
        JOptionPane.showMessageDialog(null, message);
    }
}

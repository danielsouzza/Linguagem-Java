package Training.Livro.Bank;
import java.lang.Integer;
import javax.swing.JOptionPane;


public class AccountMain {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);
        int depositAmount;

        // deposit made to account 1
        depositAmount = 
            Integer.parseInt(JOptionPane.showInputDialog("Enter deposit amount for account1:"));
        account1.deposit(depositAmount);
        displayAccount(account1);

        //deposit made to account 2
        depositAmount = 
           Integer.parseInt(JOptionPane.showInputDialog("Enter deposit amount for account2:"));
        account2.deposit(depositAmount);
        displayAccount(account2);
    }

    public static void displayAccount(Account accountToDisplay){
        String toDisplay = String.format("%s balance: $%.2f %n",
            accountToDisplay.getName(), accountToDisplay.getBalance());
        JOptionPane.showMessageDialog(null, toDisplay);
    } 
}

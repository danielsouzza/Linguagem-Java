package Training.Livro.Bank;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name = name;
        if(balance > 0.0) this.balance = balance;
    }

    public void deposit(double value){
        if(value > 0.0) this.balance += value;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }

    public double getBalance(){
        return this.balance;
    }
}

package group_03.java_06;

public class Main {
    public static void main(String[] args){
        BankAccount account1 = BankAccount.getInstance(1, "Filan", "TEB", 100.0);
        BankAccount account2 = BankAccount.getInstance(2, "Fisteku Filan", "RBKO", 0);

        account1.details();
        account1.withdraw(500);
        account1.deposit(750);
//        account1.balance = 0;
//        account1.setBalance(0);

        account1.withdraw(500);

        account1.setName("Filan Fisteku");
        account1.details();
    }

}

// private, protected, public, default
// getters, setters
class BankAccount{
    private int id;
    private String name;
    private String bankName;
    private double balance;
    private BankAccount(int id, String name, String bankName, double balance){
        this.id = id;
        this.name = name;
        this.bankName = bankName;
        this.balance = balance;
    }
    private BankAccount(int id, String name, String bankName){
        this.id = id;
        this.name = name;
        this.bankName = bankName;
        this.balance = 0.0;
    }
    public static BankAccount getInstance(int id, String emri, String bankName, double balance){
        // logic ....
        if(balance < 0){
            System.out.println("Balance is not valid!");
            return null;
        }

        return new BankAccount(id, emri, bankName, balance);
    }
    protected void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount to deposit!");
            return;
        }
        this.balance += amount;
        System.out.println("Current balance value: " + this.balance);
    }
    public void withdraw(double amount){
        if(amount <= 0 || amount > this.balance){
            System.out.println("Invalid amount to withdraw!");
            return;
        }
        this.balance -= amount;
        System.out.println("Current balance value: " + this.balance);
    }
    void details(){
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Bank name: " + this.bankName);
        System.out.println("Balance: " + this.balance);
    }

    public double getBalance(){
        return this.balance;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        if(name.length() < 7 || name.split(" ").length != 2){
            System.out.println("New name is not valid!");
            return;
        }
        this.name = name;
    }
}

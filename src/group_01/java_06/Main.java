package group_01.java_06;

public class Main {
    public static void main(String[] args){
        BankAccount account = BankAccount.getInstance("Filan", "TEB", 1000.0);
        account.printDetails();

        account.withdraw(2000);

        account.withdraw(500);

        account.deposit(750);
        account.setName("Filan Fisteku");
        account.printDetails();

    }
}

// Modifikatoret e qasjes: private, public, protected, default

// Atributeve te klases ju vendosim modifikatorin privat dhe qasja e tyre behet permes getters dhe setters
class BankAccount{
    private String name;
    private String bank; //
    private double amount;
    private BankAccount(String name, String bank, double amount){
        this.name = name;
        this.bank = bank;
        this.amount = amount;
    }
    private BankAccount(String name, String bank){
        this.name = name;
        this.bank = bank;
    }
    public static BankAccount getInstance(String name, String bank, double amount){
       if(amount < 100){
           return null;
       }
       return new BankAccount(name, bank, amount);
    }
    void printDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Bank: " + this.bank);
        System.out.println("Amount: " + this.amount);
    }
    void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount value!");
            return;
        }
        this.amount += amount;
        System.out.println("Current amount: " + this.amount);
    }
    void withdraw(double amount){
        if(amount > this.amount){
            System.out.println("You don't have enough founds!");
            return;
        }
        this.amount -= amount;
        System.out.println("Remaining amount: " + this.amount);
    }
    void setName(String name){
        if(name.length() < 10 || name.split(" ").length != 2){
            System.out.println("Name is not valid!");
            return;
        }
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    String getBank(){
        return this.bank;
    }

}

package group_04.java_06;

import java.util.HashSet;

// Id:
// - numer 5-shifror me vlere unike
// - i gjeneruar ne menyre te rastesishme gjate krijimit te objektit
public class Main {
    public static void main(String[] args){
        BankAccount account1 = BankAccount.getInstance("Filan Fisteku", "RBKO", 100.0);
        BankAccount account2 = BankAccount.getInstance("Fisteku Filan", "TEB", 0.0);

        account1.details();
        account1.withdraw(500);
        account1.deposit(100);
        account1.details();
        account1.withdraw(100);

//        account1.balance = 1000;
//        account1.getBalance();
        account1.withdraw(1000);
        account1.setName(" ");
        account1.setName("Filan");

    }
}

// private, protected, public dhe default
// private + getters + setters
class BankAccount{
    private static HashSet<Integer> generatedIds = new HashSet<>();
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
        this.balance = 0;
    }
    public static BankAccount getInstance(String name, String bankName, double balance){
        if(balance < 0){
            return null;
        }
//        ...
        int id = generateUniqueId();
        return new BankAccount(id, name, bankName, balance);
    }

    protected void details(){
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Bank name: " + this.bankName);
        System.out.println("Balance: " + this.balance);
    }
    void deposit(double amount){
        System.out.println("To deposit: " + amount);
        if(amount <= 0){
            System.out.println("Invalid amount to deposit!");
            return;
        }
        this.balance += amount;
        this.printAccountValue();
    }
    void withdraw(double amount){
        System.out.println("To withdraw: " + amount);
        if(amount <= 0 || amount > this.balance){
            System.out.println("Invalid amount to withdraw!");
            return;
        }
        this.balance -= amount;
        this.printAccountValue();
    }
    private void printAccountValue(){
        System.out.println("Account value: " + this.balance);
    }

    public double getBalance(){ // getter
        return this.balance;
    }

    public String getName(){ // getter
        return this.name;
    }
    public void setName(String name){ // setter
        if(name.length() < 7 || name.split(" ").length != 2){
//            System.out.println("New name '" + name + "' is not valid!");
            System.out.printf("New name '%s' is not valid! \n", name);
            return;
        }
        this.name = name;
    }

    private static int generateUniqueId(){
        int id = MathUtil.random(10000, 99999);
        if(!generatedIds.contains(id)){
            generatedIds.add(id);
            return id;
        }
        return generateUniqueId();
    }

}



class MathUtil{
    static int random(int x, int y){
        // 0 - 100?
        double value = x + Math.random() * (y - x);
        return (int) Math.round(value);
    }
}






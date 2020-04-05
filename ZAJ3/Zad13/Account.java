package Zad13;

/**
 * summary: Account UML implementation.
 * author: Mateusz Hinca
 **/
public class Account {

    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount) {
        this.setBalance(balance + amount);
        return balance;
    }

    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance = balance - amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= this.balance) {
            another.setBalance(another.getBalance() + amount);
            this.setBalance(getBalance()-amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    @Override
    public String toString() {
        return "Account[" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ']';
    }
}

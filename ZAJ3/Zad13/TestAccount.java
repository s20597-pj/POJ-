package Zad13;

/**
 * summary: Account UML test class.
 * author: Mateusz Hinca
 **/
public class TestAccount {
    public static void main(String[] args) {
        Account mateuszAccount = new Account("1","Mateusz",0);
        Account otherAccount = new Account("2","OtherGuy",0);
        System.out.println(mateuszAccount.credit(100));
        System.out.println(otherAccount.debit(100));
        System.out.println(mateuszAccount.transferTo(otherAccount,500));
        System.out.println(mateuszAccount.transferTo(otherAccount,50));
        System.out.println(mateuszAccount.getBalance());
        System.out.println(otherAccount.getBalance());
        System.out.println(otherAccount.toString());
    }
}
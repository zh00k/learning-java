package parttwo;

import java.util.Locale;

public class BankAccount {
    private String ownerName;
    private double balance;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Баланс не может быть отрицательным");
        } else {
            this.balance = balance;
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setOwnerName("Валерий Альбертович");
        System.out.println("Владелец аккаунта: " + bankAccount.getOwnerName());
        bankAccount.setBalance(1000);
        System.out.printf(Locale.US, "Баланс: %.2f%n", bankAccount.getBalance());
        bankAccount.setBalance(-500);
        System.out.printf(Locale.US, "Новый баланс: %.2f%n", bankAccount.getBalance());
    }
}
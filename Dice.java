import java.util.Scanner;

class Dob {
    private int day, month, year;

    public Dob(int day, int month, int year) {
        this.day = day;
        this. month = month;
        this.year = year;
    }

    public String getDob() {
        return day + "/" + month + "/" + year;
    }
}

class Account {
    private String name;
    private Dob dob;
    private double balance;

    public Account(String name, Dob dob, double balance) {
        this.name = name;
        this.dob = dob;
        this.balance = balance;
    }

    public void depositAmount(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    public void withdrawAmount(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("bill gates ki ulad na ban jitna ha guzra kr.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public Dob getDob() {
        return dob;
    }

    public void setDob(Dob dob) {
        dob = dob;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" account holder ka name dalo:");
        String name = scanner.nextLine();

        System.out.println("apni landing ki tarih dalo (dd mm yyyy):");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        Dob dob = new Dob(day, month, year);

        System.out.println("Enter initial balance:");
        double balance = scanner.nextDouble();

        Account account = new Account(name, dob, balance);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Display Balance");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: $" + account.getBalance());
                    break;
                case 2:
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    account.depositAmount(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdrawAmount(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("ooo bhai izaat ras nai ha aram sa 1..2..3..4 ma sa koi dalo");
            }
        } while (choice != 4);

    }
}

public class Bank {
    String name;
    double balance;

    Bank(String name) {
        this.balance = 0;
        this.name = name;
    }

    Bank(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println("Bilans konta to: " + this.balance);
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
    
    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Nie można wybrać pieniędzi, kwota jest większa niż bilans");
        } else if (amount > 500){
            System.out.println("Nie można wybrać ponad 500 zł na raz");
        }
        else {
            this.balance -= amount;
        }
    }

    public static void main(String[] args) {
        Bank b1 = new Bank("Marcin");

        b1.deposit(500);
        b1.displayBalance();
        b1.deposit(200);
        b1.displayBalance();
        b1.withdraw(500);
        b1.displayBalance();
        b1.withdraw(300);
        b1.displayBalance();
    }
}
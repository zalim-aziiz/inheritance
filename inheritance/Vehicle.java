package inheritance;

    public class Vehicle {
        String brand = "Ford";
        public void honk(){
            System.out.println("Hooooonk Hooooonk!!!");
        }
    }

    class Car extends Vehicle {
        private final String modelName = "Mustang";

        public static void main(String[] args) {
            Car myCar = new Car();

            myCar.honk();

            System.out.println(myCar.brand + " " + myCar.modelName);
        }
        //  Here is the code for the Account, SavingsAccount and CurrentAccount classes:

        //Class Account
        public class Account {
            private double balance;

            public Account(double balance) {
                this.balance = balance;
            }

            public double getBalance() {
                return balance;
            }

            public void deposit(double amount) {
                balance += amount;
            }

            public void withdraw(double amount) {
                balance -= amount;
            }
        }

        //Class SavingsAccount
        public class SavingsAccount extends Account {
            private double interest;

            public SavingsAccount(double balance, double interest) {
                super(balance);
                this.interest = interest;
            }

            public void addInterest() {
                deposit(getBalance() * interest);
            }
        }

        //Class CurrentAccount
        public class CurrentAccount extends Account {
            private double overdraftLimit;

            public CurrentAccount(double balance, double overdraftLimit) {
                super(balance);
                this.overdraftLimit = overdraftLimit;
            }

            public void checkOverdraft() {
                if (getBalance() < 0 && getBalance() > overdraftLimit) {
                    //send letter
                }
            }
        }

        //Class Bank
        public class Bank {
            private Account[] accounts;
        }
    }



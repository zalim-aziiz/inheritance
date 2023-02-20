package inheritance.exercises;

public class savingAccount extends Account{

    private double interest;

    public savingAccount(int a) {
        super(a);
    }

    public double setInterest(double balance){
        double principle = balance;
        double rate= 1.5;
        double time= 2;

        return  principle*rate*time;
    }
}

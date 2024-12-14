package cs112.ud2.models;

public class Checkings extends BankSystem {
    //Fields

    protected double checkingsAmount = 0;
    protected double totalCheckingsAmount = 0;

    public static final double DEFAULT_CHECKINGSAMOUNT = 50;


    //Constructors
    //Full Constructor
    public Checkings(String name, String email, String password, String address, String birthday, int ssn,
                     String accType, double checkingsAmount) {
        super(name, email, password, address, birthday, ssn, accType);
        totalCheckingsAmount += checkingsAmount;
        checkingsAmount = this.checkingsAmount;
    }

    // Default Constructor

    public Checkings() {
        this(DEFAULT_NAME, DEFAULT_EMAIL, DEFAULT_PASSWORD, DEFAULT_ADDRESS, DEFAULT_BIRTHDAY, DEFAULT_SSN, DEFAULT_ACCTYPE,
                DEFAULT_CHECKINGSAMOUNT);
    }



    //Copy Constructor

    //Setters
    public void setCheckingsAmount(double checkingsAmount) {
        this.checkingsAmount = checkingsAmount;
    }

    public void setTotalCheckingsAmount(double totalCheckingsAmount) {
        this.totalCheckingsAmount = totalCheckingsAmount;
    }

    //Getters
    public double getCheckingsAmount() {
        return this.checkingsAmount;
    }

    public double getTotalCheckingsAmount() {
        return this.totalCheckingsAmount;
    }

    //Other Methods
    @Override
    public String toString() {
        return super.toString() + "\nTotal Checkings Amount" + currency.format(totalCheckingsAmount);

//        return super.toString() + "\nCheckings Amount: " + currency.format(checkingsAmount) + "\nTotal Checkings Amount"
//                + currency.format(totalCheckingsAmount);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || getClass() != other.getClass())
            return false;
        BankSystem otherBank = (BankSystem) other;
        return super.equals(other) &&
                this.checkingsAmount == otherBank.checkingsAmount;
    }

    public void checkingsWidthraw(double amount) {
        totalCheckingsAmount -= amount;
    }

    public void checkingsDeposit(double amount) {
        totalCheckingsAmount += amount;
    }

}

//Method for Money transfer from Savings to Checkings
    /*
    public void transferSavingsToCheckings(double transferAmount, int choice2) {

        if (transferAmount >= savingsAmount) {
            System.out.println("You do not have enough money in your Savings");

        } else {
            checkingsAmount += transferAmount;
            savingsAmount -= transferAmount;
            System.out.println("Transfer Successful!\n Amount Transferred: $" + transferAmount +
                    "\nCurrent Balance in Checkings: " + checkingsAmount +
                    "\nCurrent Balanace in Savings: " + savingsAmount);

        }

    }
    */

//transfer from Checkings to Savings
/*
    public void transferCheckingsToSavings(double transferAmount) {
        /*
            savingsAmount += transferAmount;
            totalCheckingsAmount -= transferAmount;
            System.out.println ("Transfer Successful!\n Amount Transferred: $" + transferAmount +
                    "\nCurrent Balance in Checkings: " + totalCheckingsAmount +
                    "\nCurrent Balanace in Savings: " + savingsAmount);

        if (transferAmount > this.getTotalCheckingsAmount()) {
            System.out.println("You do not have enough money in your Checkings");

        } else { //transfer from checkings to savings
            savingsAmount += transferAmount;
            checkingsAmount -= transferAmount;
            System.out.println("Transfer Successful!\n Amount Transferred: $" + transferAmount +
                    "\nCurrent Balance in Checkings: " + checkingsAmount +
                    "\nCurrent Balanace in Savings: " + savingsAmount);
        }

        }
        */





    /*
    public static void checkingsTransfer(double transferAmount, int choice2) {

        if (transferAmount > totalCheckingsAmount) {
            System.out.println("You do not have enough money in your Checkings");
        } else if (transferAmount < totalCheckingsAmount) {
            checkingsWidthraw(transferAmount);
            savingsDeposit(transferAmount);

        }
            */



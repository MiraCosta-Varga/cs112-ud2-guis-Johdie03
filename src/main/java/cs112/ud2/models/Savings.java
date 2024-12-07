package cs112.ud2.models;
public class Savings extends BankSystem {

    //Fields
    //private double savingsAmount;
    protected double savingsAmount = 0;
    protected double totalSavingsAmount = 0;

    public static final double DEFAULT_SAVINGS_AMOUNT = 80;

    //Constructor
    //Full Constructor
    public Savings(String name, String email, String password, String address, String birthday, int ssn, String accType,
                   double savingsAmount) {
        super(name, email, password, address, birthday, ssn, accType);
        totalSavingsAmount += savingsAmount;
        savingsAmount = this.savingsAmount;

    }

    //Default Constructor
    /* Default Constructor */

    public Savings() {
        this(DEFAULT_NAME, DEFAULT_EMAIL, DEFAULT_PASSWORD, DEFAULT_ADDRESS, DEFAULT_BIRTHDAY, DEFAULT_SSN, DEFAULT_ACCTYPE, DEFAULT_SAVINGS_AMOUNT);
    }


    //Setters
    public void setSavingsAmount(double savingsAmount) {
        this.savingsAmount = savingsAmount;
    }

    public void setTotalSavingsAmount(double totalSavingsAmount) {
        this.totalSavingsAmount = totalSavingsAmount;
    }

    //Getters
    public double getSavingsAmount() {
        return this.savingsAmount;
    }

    public double getTotalSavingsAmount() {
        return this.totalSavingsAmount;
    }

    //Other Methods
    @Override
    public String toString() {
        return super.toString() + "\nSavings Total Amount: " + currency.format(savingsAmount) + "\nSavings Amount"
                + currency.format(totalSavingsAmount);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || getClass() != other.getClass())
            return false;
        BankSystem otherBank = (BankSystem) other;
        return super.equals(other) &&
                this.savingsAmount == otherBank.savingsAmount;
    }

    public void savingsWidthraw(double amount) {
        totalSavingsAmount -= amount;
    }

    public void savingsDeposit(double amount) {
        totalSavingsAmount += amount;
    }

}

//Method for Money transfer from Checkings to Savings
    /*
    public void transferCheckingsToSavings(double transferAmount) {
        savingsAmount += transferAmount;
        /*checkingsAmount -= transferAmount;
        System.out.println("Transfer Successful!\n Amount Transferred: $" + transferAmount +
                "\nCurrent Balance in Checkings: " + checkingsAmount +
                "\nCurrent Balanace in Savings: " + savingsAmount);

    }

    //Method for Money transfer from Savings to Checkings
    public void transferSavingsToCheckings(double transferAmount) {


        checkingsAmount += transferAmount;
        totalSavingsAmount -= transferAmount;
        System.out.println ("Transfer Successful!\n Amount Transferred: $" + transferAmount +
                "\nCurrent Balance in Checkings: " + totalSavingsAmount +
                "\nCurrent Balanace in Savings: " + savingsAmount);


         if (transferAmount > this.getTotalSavingsAmount() ) {
            System.out.println ("You do not have enough money in your Checkings") ;

        } else {
            checkingsAmount += transferAmount;
            savingsAmount -= transferAmount;
            System.out.println("Transfer Successful!\n Amount Transferred: $" + transferAmount +
                    "\nCurrent Balance in Checkings: " + checkingsAmount +
                    "\nCurrent Balanace in Savings: " + savingsAmount);
        }

    }
}
*/
     /*
    public void savingsWidthraw(double amount) {
        double withdrawAmount = amount;
        totalSavingsAmount = savingsAmount -= withdrawAmount;
    }

    public double savingsDeposit(double depositAmount) {
        totalSavingsAmount += depositAmount;

        return totalSavingsAmount;
    }
        */





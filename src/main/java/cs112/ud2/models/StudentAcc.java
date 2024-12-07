package cs112.ud2.models;

class StudentAcc implements MonthlyFees{

    private static final double MONTHLY_FEE = 0.99;
    private static final String ACC_TYPE = "Student";

    @Override
    public double monthlyFees(){
        return MONTHLY_FEE;
    }

    @Override
    public String accType(){
        return ACC_TYPE;
    }

    @Override
    public String toString(){
        return "Account Type: " + ACC_TYPE +
                "\nMonthly Fees: " + MONTHLY_FEE;
    }

}
//class CheckingAccount implements BankAccount{
// double monthlyFees();
// void type();




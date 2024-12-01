package cs112.ud2.models;

class BusinessAcc implements MonthlyFees{

    private static final double MONTHLY_FEE = 7.99;
    private static final String ACC_TYPE = "Business";

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
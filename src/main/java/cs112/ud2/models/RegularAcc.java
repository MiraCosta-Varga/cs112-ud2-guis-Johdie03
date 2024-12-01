package cs112.ud2.models;

class RegularAcc implements MonthlyFees{
    private static final double MONTHLY_FEE = 4.99;
    private static final String ACC_TYPE = "Regular";


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

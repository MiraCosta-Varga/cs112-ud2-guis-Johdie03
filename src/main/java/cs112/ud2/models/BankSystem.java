package cs112.ud2.models;
/*
 * bankSystem
 * abstract class to allow inheritance for different account types
 */
import java.text.NumberFormat;
/*
import java.time.LocalDate;
import java.util.Date;
*/

public abstract class BankSystem {

    protected static NumberFormat currency = NumberFormat.getCurrencyInstance();
    protected static String accType;

    // Instance Variables
    private String name;
    private String password;
    private String email;
    private String address;
    private String birthday;
    private int ssn;

    protected double checkingsAmount = 0;
    protected double savingsAmount = 0;

    //Constance Variables
    public static final String DEFAULT_NAME = "Michael Smith";
    public static final String DEFAULT_PASSWORD = "muffin123";
    public static final String DEFAULT_EMAIL = "michaelS@gmail.com";
    public static final String DEFAULT_ADDRESS = "123 Street City, CA 92000, US";
    public static final String DEFAULT_BIRTHDAY = "01/01/2000";
    //public static final Date DEFAULT_BIRTHDAY = 0;
    public static final int DEFAULT_SSN = 1234;
    public static final String DEFAULT_ACCTYPE = "Regular";

    // public static final double DEFAULT_CHECKINGSAMOUNT = 50;
    // public static final double DEFAULT_SAVINGS_AMOUNT = 80;

    /***  Constructor Methods ***/
    /* Default Constructor */
    /*
    public BankSystem() {
        this(DEFAULT_NAME, DEFAULT_EMAIL, DEFAULT_PASSWORD, DEFAULT_ADDRESS, DEFAULT_BIRTHDAY, DEFAULT_SSN,
                DEFAULT_ACCTYPE);
    }

     */

    /* Full Constructor */
    public BankSystem(String name, String email, String password, String address, String birthday, int ssn,
                      String accType) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.birthday = birthday;
        this.ssn = ssn;
        BankSystem.accType = accType;
    }

    /* Copy Constructor */
    public BankSystem(BankSystem original) {
        if (original == null) {
            throw new IllegalArgumentException("Bad deep copy");
        } else {
            this.setAll(original.name, original.email, original.password, original.address, original.birthday,
                    original.ssn, BankSystem.accType);

        }

    }

    /* setters */
    /*
    public String setName(String name) {

    if (name == null) {
        throw new IllegalArgumentException("ERROR- Please enter your name: ");
        }
       return this.name = name;
    }
    */

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    /*

    public void setCheckingsAmount(double checkingsAmount) {
        this.checkingsAmount = checkingsAmount;
    }

    public void setSavingsAmount(double savingsAmount) {
        this.savingsAmount = savingsAmount;
    }

    */

    public void setAccType(String accType) {
        BankSystem.accType = accType;
    }

    public void setAll(String name, String email, String password, String address, String birthday, int ssn, String accType) {
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);
        this.setAddress(address);
        this.setBirthday(birthday);
        this.setSsn(ssn);
        // this.setCheckingsAmount(checkingsAmount);
        // this.setSavingsAmount(savingsAmount);
        this.setAccType(accType);

    }

    /* getters */
    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public String getAddress() {
        return this.address;
    }

    public int getSsn() {
        return this.ssn;
    }

    /*
    public double getCheckingsAmount() {
        return this.checkingsAmount;
    }

    public double getSavingsAmount() {
        return this.savingsAmount;
    }
        */

    public String getAccType() {
        return BankSystem.accType;
    }

    /* Other Methods */
    @Override
    public boolean equals(Object other) {
        /*if(this == other) return true;
        else if (other == null || getClass() != other.getClass())
        return false;
        */
        if (other == null || !(other instanceof BankSystem)) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    public String toString() {
        return "Name: " + this.name +
                "\nPassword: " + this.password +
                "\nEmail: " + this.email +
                "\nBirthday: " + this.birthday +
                "\nAddress: " + this.address +
                "\nSSN: " + this.ssn +
                "\nAccount Type: " + BankSystem.accType;

    }

    //calculate age method
    /*public static int age(Date birthday) {
        LocalDate currentDate = LocalDate.now();

    }
        */

    /*
    //OTHER METHODS
    public void checkingsWidthraw(double amount) {
        double withdrawAmount = amount;
        checkingsAmount -= withdrawAmount;
    }

    public void checkingsDeposit(double amount) {
        double depositAmount = amount;
        checkingsAmount += depositAmount;
    }

    public void savingsWidthraw(double amount) {
        double withdrawAmount = amount;
        savingsAmount -= withdrawAmount;
    }

    public void savingsDeposit(double amount) {
        double depositAmount = amount;
        savingsAmount += depositAmount;
    }
        */

}

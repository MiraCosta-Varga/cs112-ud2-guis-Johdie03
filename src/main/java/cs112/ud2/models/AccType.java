package cs112.ud2.models;

public class AccType {

        protected static String accType;


        public AccType(String name, String email, String password, String address, String birthday, int ssn, String accType, double checkingsAmount, double savingsAmount) {
            super();
        }

        public static String typeOfAcc() {
            String message;
            if ((accType).equalsIgnoreCase("Student")) {
                StudentAcc studentAccType;
                studentAccType = new StudentAcc();
                message = studentAccType + "\nAccount Created!";
            } else if ("Business".equalsIgnoreCase(accType)) {
                BusinessAcc businessAccType;
                businessAccType = new BusinessAcc();
                message = businessAccType + "\nAccount Created!";
            } else if ("Regular".equalsIgnoreCase(accType)) {
                RegularAcc regularAccType;
                regularAccType = new RegularAcc();
                message = regularAccType + "\nAccount Created!";
            } else {
                message = "Please pick one option (1-3):";
            }
            return message;
        }



    }


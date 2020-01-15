package Lab2;

import java.util.Scanner;

public class Validation {
    private final static Scanner in = new Scanner(System.in);
    private static final String BINARY_VALID = "[0-1]*";
    private static final String DECIMAL_VALID = "[0-9]*";
    private static final String HEXADECIMAL_VALID = "[0-9A-F]*";

    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in range [" + min + "," + max + "]");
                System.out.println("Enter again: ");
            }
        }
    }

    public static String checkInputBinary(){
        System.out.print("Enter number binary: ");
        String result;
        while (true){
            result = in.nextLine().trim();
            if(result.matches(BINARY_VALID)){
                return result;
            }
            System.err.println("Must be 0 or 1");
            System.out.print("Enter again: ");
        }
    }

    public static String checkInputDecimal(){
        System.out.print("Enter number decimal: ");
        String result;
        while (true){
            result = in.nextLine().trim();
            if(result.matches(DECIMAL_VALID)){
                return result;
            }
            System.err.println("Must be 0 - 9");
            System.out.print("Enter again: ");
        }
    }

    public static String checkInputHexaDecimal(){
        System.out.print("Enter number hexadecimal: ");
        String result;
        while (true){
            result = in.nextLine().trim();
            if(result.matches(HEXADECIMAL_VALID)){
                return result;
            }
            System.err.println("Must be 0 - 9");
            System.out.print("Enter again: ");
        }
    }

    public static String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not Empty");
                System.out.println("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static boolean checkInputYN() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N");
            System.out.println("Enter again: ");
        }
    }
}

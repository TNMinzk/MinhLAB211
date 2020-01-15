package Lab3_52;

import java.util.ArrayList;
import java.util.Scanner;

public class Validation {
    private final Scanner in = new Scanner(System.in);

    public int checkInputIntLimit(int min, int max) {
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

    public double checkInputDouble() {
        while (true) {
            try {
                return Double.parseDouble(in.nextLine().trim());
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
                System.out.print("Enter again: ");
            }
        }
    }

    public String checkInputString() {
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

    public boolean checkInputYN() {
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

    public boolean checkCountryCodeExist(ArrayList<EACountries> lc, String code) {
        for (EACountries country : lc) {
            if (country.getCountryCode().equalsIgnoreCase(code)) {
                return false;
            }
        }
        return true;
    }

    public boolean checkCountryNameExist(ArrayList<EACountries> lc, String name) {
        for (EACountries country : lc) {
            if (country.getCountryName().equalsIgnoreCase(name)) {
                return false;
            }
        }
        return true;
    }
}

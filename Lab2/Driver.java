package Lab2;

public class Driver {
    public static void main(String[] args) {
        Manager mn = new Manager();
        while (true) {
            int choice = mn.menu();
            switch (choice) {
                case 1:
                    String binary = Validation.checkInputBinary();
                    mn.convertFromBinary(binary);
                    break;
                case 2:
                    String decimal = Validation.checkInputDecimal();
                    mn.convertFromDecimal(decimal);
                    break;
                case 3:
                    String hexadecimal = Validation.checkInputHexaDecimal();
                    mn.convertFromHexa(hexadecimal);
                    break;
                case 4:
                    return;
            }
        }
    }
}
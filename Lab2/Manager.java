package Lab2;

public class Manager {
    public int menu() {
        System.out.println("1.Convert from Binary");
        System.out.println("2.Convert from Decimal");
        System.out.println("3.Convert from Hexadecimal");
        System.out.println("4.Exit");
        return Validation.checkInputIntLimit(1, 4);
    }

    public int displayConvert(String from, String toCase1, String toCase2){
        System.out.println("1.Convert from " + from + " to " + toCase1);
        System.out.println("2.Convert from " + from + " to " + toCase2);
        System.out.print("Enter your choice: ");
        return Validation.checkInputIntLimit(1,2);
    }

    public void convertFromBinary(String binary){
        int choice = displayConvert("binary", "decimal", "hexadecimal");
        switch (choice){
            case 1:
                System.out.println("Decimal: " + convertBinaryToDecimal(binary));
                break;
            case 2:
                System.out.println("Hexadecimal: " + convertBinaryToHexa(binary));
                break;
        }
    }

    public void convertFromDecimal(String decimal){
        int choice = displayConvert("decimal", "binary","hexadecimal");
        switch (choice){
            case 1:
                System.out.println("Binary: " + convertDecimalToBinary(decimal));
                break;
            case 2:
                System.out.println("Hexadecimal: " + convertDecimalToHexa(decimal));
                break;
        }
    }

    public void convertFromHexa(String hexadecimal){
        int choice = displayConvert("hexadecimal", "binary", "decimal");
        switch (choice){
            case 1:
                System.out.println("Binary: " + convertHexaToBinary(hexadecimal));
                break;
            case 2:
                System.out.println("Decimal: " + convertHexaToDecimal(hexadecimal));
                break;
        }
    }

    public String convertBinaryToDecimal(String binary){
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toString(decimal);
    }

    public String convertBinaryToHexa(String binary){
        int hexadecimal = Integer.parseInt(binary, 2);
        return Integer.toString(hexadecimal);
    }

    public int convertHexaToDecimal(String hexadecimal){
        return Integer.parseInt(hexadecimal, 16);
    }

    public String convertHexaToBinary(String hexadecimal){
        return Integer.toBinaryString(Integer.parseInt(hexadecimal));
    }

    public String convertDecimalToBinary(String decimal){
        return Integer.toBinaryString(Integer.parseInt(decimal));
    }

    public String convertDecimalToHexa(String decimal){
        return Integer.toHexString(Integer.parseInt(decimal));
    }
}
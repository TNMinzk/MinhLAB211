package Lab3_51;

public class Manager {
    Validation vd = new Validation();

    public int menu() {
        System.out.println("1.Normal calculator");
        System.out.println("2.BMI calculator");
        System.out.println("3.Exit");
        System.out.print("Enter your choice: ");
        return vd.checkInputIntLimit(1, 3);
    }

    public double inputNumber() {
        System.out.print("Enter number: ");
        return vd.checkInputDouble();
    }

    public void normalCalculator() {
        double memory;
        System.out.print("Enter number: ");
        memory = vd.checkInputDouble();
        while (true) {
            System.out.print("Enter operator: ");
            String operator = vd.checkInputOperator();
            if (operator.equalsIgnoreCase("+")) {
                memory += inputNumber();
                System.out.println("Memory: " + memory);
            } else if (operator.equalsIgnoreCase("-")) {
                memory -= inputNumber();
                System.out.println("Memory: " + memory);
            } else if (operator.equalsIgnoreCase("*")) {
                memory *= inputNumber();
                System.out.println("Memory: " + memory);
            } else if (operator.equalsIgnoreCase("/")) {
                memory /= inputNumber();
                System.out.println("Memory: " + memory);
            } else if (operator.equalsIgnoreCase("^")) {
                memory = Math.pow(memory, inputNumber());
                System.out.println("Memory: " + memory);
            } else if (operator.equalsIgnoreCase("=")) {
                System.out.println("Result: " + memory);
                return;
            }
        }
    }

    public String BMIStatus(double bmi) {
        if (bmi < 19) {
            return "Under-standard";
        } else if (bmi >= 19 && bmi < 25) {
            return "Standard";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else if (bmi >= 30 && bmi < 40) {
            return "Fat";
        } else return "Very fat";
    }

    public void BMICalculator() {
        System.out.print("Enter weight(kg): ");
        double weight = vd.checkInputDouble();
        System.out.print("Enter height(cm): ");
        double height = vd.checkInputDouble();
        double bmi = weight * 10000 / (height * height);
        System.out.printf("BMI number: %2f\n", bmi);
        System.out.println("BMI status: " + BMIStatus(bmi));
    }
}
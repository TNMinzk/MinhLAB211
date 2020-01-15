package Lab3_50;


public class Manager {
    Validation vd = new Validation();

    public int menu() {
        System.out.println("1. Calculate superlative equation");
        System.out.println("2. Calculate quadratic equation");
        System.out.println("3. Exit");
        return vd.checkInputIntLimit(1, 3);
    }

    public void superlativeEquation() {
        System.out.print("Enter A: ");
        double a = vd.checkInputDouble();
        System.out.print("Enter B: ");
        double b = vd.checkInputDouble();
        double x = -b / a;
        System.out.println("Solution x=" + x);

        System.out.print("Odd number: ");
        if (vd.checkOdd(a)) System.out.print(a + " ");
        if (vd.checkOdd(b)) System.out.print(b + " ");
        if (vd.checkOdd(x)) System.out.print(x + " ");

        System.out.print("\nEven number: ");
        if (vd.checkEven(a)) System.out.print(a + " ");
        if (vd.checkEven(b)) System.out.print(b + " ");
        if (vd.checkEven(x)) System.out.print(x + " ");

        System.out.print("\nPerfect square: ");
        if (vd.checkSquareNumber(a)) System.out.print(a + " ");
        if (vd.checkSquareNumber(b)) System.out.print(b + " ");
        if (vd.checkSquareNumber(x)) System.out.print(x + " ");

        System.out.println();
    }

    public void quadraticEquation() {
        System.out.print("Enter A: ");
        double a = vd.checkInputDouble();
        System.out.print("Enter B: ");
        double b = vd.checkInputDouble();
        System.out.print("Enter C: ");
        double c = vd.checkInputDouble();

        double d = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);
        System.out.println("Solution x1=" + x1 + ", Solution x2=" + x2);

        System.out.print("Odd number: ");
        if (vd.checkOdd(a)) System.out.print(a + " ");
        if (vd.checkOdd(b)) System.out.print(b + " ");
        if (vd.checkOdd(c)) System.out.print(c + " ");
        if (vd.checkOdd(x1)) System.out.print(x1 + " ");
        if (vd.checkOdd(x2)) System.out.print(x2 + " ");

        System.out.print("\nEven number: ");
        if (vd.checkEven(a)) System.out.print(a + " ");
        if (vd.checkEven(b)) System.out.print(b + " ");
        if (vd.checkEven(c)) System.out.print(c + " ");
        if (vd.checkEven(x1)) System.out.print(x1 + " ");
        if (vd.checkEven(x2)) System.out.print(x2 + " ");

        System.out.println("\nPerfect square: ");
        if (vd.checkSquareNumber(a)) System.out.print(a + " ");
        if (vd.checkSquareNumber(b)) System.out.print(b + " ");
        if (vd.checkSquareNumber(c)) System.out.print(c + " ");
        if (vd.checkSquareNumber(x1)) System.out.print(x1 + " ");
        if (vd.checkSquareNumber(x2)) System.out.print(x2 + " ");

        System.out.println();
    }
}
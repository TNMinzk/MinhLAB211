package sample;

public class Manager {
    Validation vd = new Validation();

    public int menu() {
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
        System.out.println("4.");
        return vd.checkInputIntLimit(1, 4);
    }
}